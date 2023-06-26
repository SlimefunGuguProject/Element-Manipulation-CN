package me.lucasgithuber.elementmanipulation.category;

import io.github.mooy1.infinitylib.common.Scheduler;
import io.github.mooy1.infinitylib.common.StackUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideImplementation;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import lombok.AllArgsConstructor;
import me.lucasgithuber.elementmanipulation.machines.DrugsTable;
import me.lucasgithuber.elementmanipulation.machines.Machines;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;

/**
 * A custom category for displaying 6x6 recipes and their sub-recipes
 * this guy is a god XD
 * @author Mooy1
 */
public class DrugsGroup extends FlexItemGroup {

    private static final int[] DRUGS_RECIPE_SLOTS = {
            2,3,4,5,6,7,
            11,12,13,14,15,16,
            20,21,22,23,24,25,
            29,30,31,32,33,34,
            35,36,37,38,39,40,
            47,48,49,50,51,52
    };
    private static final int[] NORMAL_RECIPE_SLOTS = {
            12, 13, 14,
            21, 22, 23,
            30, 31, 32
    };
    private static final int NORMAL_RECIPE_TYPE = 19;
    private static final int NORMAL_RECIPE_OUTPUT = 25;
    private static final int[] NORMAL_RECIPE_BACKGROUND = {
            1, 2, 3, 4, 5, 6, 7, 8,
            36, 37, 38, 39, 40, 41, 42, 43, 44
    };
    private static final int[] DRUGS_OUTPUT_BORDER = {
            36
    };
    private static final int[] DRUGS_INPUT_BORDER = {
            1, 10, 19, 28,37,46, 17,26,35,44
    };

    private static final int[] DRUGS_BACKGROUND = {
            9,18
    };
    private static final int DRUGS_OUTPUT = 45;
    private static final int BACK = 0;
    private static final int NEXT = 8;
    private static final int PREV = 53;
    private static final int DRUGS_TABLE = 27;

    private static final ItemStack CRAFT = new CustomItemStack(Material.TINTED_GLASS,
            ChatColor.GREEN + "根据库存摆放配方",
            "&a左键点击摆放1次",
            "&a右键点击尽可能摆放多次"
    );
    private static final SlimefunGuideImplementation GUIDE = Slimefun.getRegistry().getSlimefunGuide(SlimefunGuideMode.SURVIVAL_MODE);
    private static final Map<UUID, String> HISTORY = new HashMap<>();
    private static final LinkedHashMap<String, Pair<SlimefunItemStack, ItemStack[]>> ITEMS = new LinkedHashMap<>();
    private static final List<String> IDS = new ArrayList<>();

    public DrugsGroup(NamespacedKey key, ItemStack item, int tier) {
        super(key, item, tier);
        DrugsTable.TYPE.sendRecipesTo((input, output) -> {
            SlimefunItemStack sfStack = (SlimefunItemStack) output;
            IDS.add(sfStack.getItemId());
            ITEMS.put(sfStack.getItemId(), new Pair<>(sfStack, input));
        });
    }

    @Override
    public boolean isVisible(@Nonnull Player p, @Nonnull PlayerProfile profile, @Nonnull SlimefunGuideMode layout) {
        return false;
    }

    @Override
    public void open(Player player, PlayerProfile playerProfile, SlimefunGuideMode slimefunGuideMode) {
        open(player, new BackEntry(null, playerProfile, Slimefun.getRegistry().getSlimefunGuide(slimefunGuideMode)), false);
        playerProfile.getGuideHistory().add(this, 1);
    }

    public static void open(Player player, BlockMenu menu) {
        PlayerProfile.get(player, profile -> Scheduler.run(() -> open(player, new BackEntry(menu, profile, null), true)));
    }

    private static void open(@Nonnull Player player, @Nonnull BackEntry entry, boolean useHistory) {

        if (useHistory) {
            String id = HISTORY.get(player.getUniqueId());

            if (id != null) {
                openDrugsRecipe(player, id, entry);
                return;
            }
        }

        ChestMenu menu = new ChestMenu("&bDrugs");

        if (entry.bench != null) {
            menu.addMenuClickHandler(1, (player1, i, itemStack, clickAction) -> {
                entry.bench.open(player1);
                return false;
            });
        } else {
            menu.addMenuClickHandler(1, (player1, i, itemStack, clickAction) -> {
                entry.profile.getGuideHistory().goBack(entry.impl);
                return false;
            });
        }

        menu.addItem(0, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        menu.setEmptySlotsClickable(false);
        for (int i = 2; i < 9; i++) {
            menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        menu.addItem(45, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        menu.addItem(46, ChestMenuUtils.getPreviousButton(player, 1, 1), ChestMenuUtils.getEmptyClickHandler());
        for (int i = 47; i < 52; i++) {
            menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        menu.addItem(52, ChestMenuUtils.getNextButton(player, 1, 1), ChestMenuUtils.getEmptyClickHandler());
        menu.addItem(53, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());

        menu.addItem(1, new CustomItemStack(ChestMenuUtils.getBackButton(
                player, "", ChatColor.GRAY + Slimefun.getLocalization().getMessage(player, "guide.back.guide"))));

        int i = 9;
        for (Pair<SlimefunItemStack, ItemStack[]> item : ITEMS.values()) {
            if (i == 45) {
                break;
            }

            SlimefunItem sfItem = item.getFirstValue().getItem();
            if (sfItem == null) {
                return;
            }

            Research research = sfItem.getResearch();
            if (research != null && !entry.profile.hasUnlocked(research)) {
                ItemStack resItem = new CustomItemStack(
                        ChestMenuUtils.getNotResearchedItem(),
                        ChatColor.WHITE + ItemUtils.getItemName(sfItem.getItem()),
                        "&4&l" + Slimefun.getLocalization().getMessage(player, "guide.locked"),
                        "",
                        "&a> 单击解锁",
                        "",
                        "&7花费：&b" + research.getCost() + " 经验等级"
                );
                menu.addItem(i, resItem, (p, slot, item1, action) -> {
                    research.unlockFromGuide(GUIDE, p, entry.profile, sfItem, Categories.DRUGS_CATEGORY, 0);
                    return false;
                });
            } else {
                menu.addItem(i, item.getFirstValue(), (p, slot, item1, action) -> {
                    openDrugsRecipe(p, item.getFirstValue().getItemId(), entry);
                    return false;
                });
            }

            i++;
        }

        player.playSound(player.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1);

        HISTORY.put(player.getUniqueId(), null);

        menu.open(player);
    }

    @ParametersAreNonnullByDefault
    private static void openDrugsRecipe(Player player, String id, BackEntry entry) {
        Pair<SlimefunItemStack, ItemStack[]> pair = ITEMS.get(id);

        if (pair == null) {
            return;
        }

        ChestMenu menu = new ChestMenu(Objects.requireNonNull(pair.getFirstValue().getDisplayName()));
        menu.setEmptySlotsClickable(false);

        menu.addItem(BACK, ChestMenuUtils.getBackButton(player, ""), (player12, i, itemStack, clickAction) -> {
            open(player12, entry, false);
            return false;
        });

        for (int i = 0; i < DRUGS_RECIPE_SLOTS.length; i++) {
            ItemStack recipeItem = pair.getSecondValue()[i];
            if (recipeItem != null) {
                menu.addItem(DRUGS_RECIPE_SLOTS[i], recipeItem, (p, slot, item, action) -> {
                    SlimefunItem slimefunItem = SlimefunItem.getByItem(recipeItem);
                    if (slimefunItem != null && !slimefunItem.isDisabled()) {
                        if (slimefunItem.getRecipeType() == DrugsTable.TYPE) {
                            openDrugsRecipe(p, slimefunItem.getId(), entry);
                        } else {
                            LinkedList<SlimefunItem> list = new LinkedList<>();
                            list.add(slimefunItem);
                            openSlimefunRecipe(p, entry, id, list);
                        }
                    }
                    return false;
                });
            }
        }

        if (entry.bench == null) {
            menu.addItem(DRUGS_TABLE, Machines.DRUGS_TABLE, (p, slot, item, action) -> {
                SlimefunItem slimefunItem = Machines.DRUGS_TABLE.getItem();
                if (slimefunItem != null) {
                    LinkedList<SlimefunItem> list = new LinkedList<>();
                    list.add(slimefunItem);
                    openSlimefunRecipe(p, entry, id, list);
                }
                return false;
            });
        } else {
            menu.addItem(DRUGS_TABLE, CRAFT, (p, slot, item, action) -> {
                moveRecipe(p, entry.bench, pair, action.isRightClicked());
                return false;
            });
        }

        int page = IDS.indexOf(id);

        menu.addItem(PREV, ChestMenuUtils.getPreviousButton(player, page + 1, IDS.size()), (player1, i, itemStack, clickAction) -> {
            if (page > 0) {
                openDrugsRecipe(player1, IDS.get(page - 1), entry);
            }
            return false;
        });

        menu.addItem(NEXT, ChestMenuUtils.getNextButton(player, page + 1, IDS.size()), (player1, i, itemStack, clickAction) -> {
            if (page < IDS.size() - 1) {
                openDrugsRecipe(player1, IDS.get(page + 1), entry);
            }
            return false;
        });

        for (int slot : DRUGS_BACKGROUND) {
            menu.addItem(slot, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        for (int slot : DRUGS_BACKGROUND) {
            menu.addItem(slot, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        for (int slot : DRUGS_OUTPUT_BORDER) {
            menu.addItem(slot, DrugsGroup.OUTPUT_BORDER, ChestMenuUtils.getEmptyClickHandler());
        }
        for (int slot : DRUGS_INPUT_BORDER) {
            menu.addItem(slot, DrugsGroup.INPUT_BORDER, ChestMenuUtils.getEmptyClickHandler());
        }
        menu.addItem(DRUGS_OUTPUT, pair.getFirstValue(), ChestMenuUtils.getEmptyClickHandler());

        player.playSound(player.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1);

        HISTORY.put(player.getUniqueId(), id);

        menu.open(player);

    }

    private static void moveRecipe(@Nonnull Player player, @Nonnull BlockMenu menu, Pair<SlimefunItemStack, ItemStack[]> pair, boolean max) {
        ItemStack[] recipe = pair.getSecondValue();
        PlayerInventory inv = player.getInventory();

        for (int i = 0; i < (max ? 64 : 1); i++) {
            for (int slot = 0; slot < recipe.length; slot++) { //each item in recipe
                ItemStack recipeItem = recipe[slot];

                if (recipeItem == null) {
                    continue;
                }

                String id = StackUtils.getIdOrType(recipeItem);

                for (ItemStack item : inv.getContents()) { //each slot in their inv
                    if (item != null && StackUtils.getIdOrType(item).equals(id)) { //matches recipe
                        //get item
                        ItemStack output = item.clone();
                        output.setAmount(1);

                        if (menu.fits(output, DrugsTable.INPUT_SLOTS[slot])) {//not null and fits
                            //remove item
                            ItemUtils.consumeItem(item, 1, false);
                            //push item
                            menu.pushItem(output, DrugsTable.INPUT_SLOTS[slot]);
                            break;
                        }
                    }
                }
            }
        }

        menu.open(player);

    }

    @ParametersAreNonnullByDefault
    private static void openSlimefunRecipe(Player player, BackEntry entry, String backID, LinkedList<SlimefunItem> slimefunHistory) {
        SlimefunItem slimefunItem = slimefunHistory.peekLast();

        if (slimefunItem == null) {
            return;
        }

        ItemStack output = slimefunItem.getRecipeOutput().clone();

        ChestMenu menu = new ChestMenu(ItemUtils.getItemName(output));
        menu.setEmptySlotsClickable(false);

        int length = slimefunHistory.size();

        menu.addItem(0, ChestMenuUtils.getBackButton(player, ""), (p, slot, item, action) -> {
            if (length == 1) {
                openDrugsRecipe(player, backID, entry);
            } else {
                slimefunHistory.removeLast();
                openSlimefunRecipe(player, entry, backID, slimefunHistory);
            }
            return false;
        });

        for (int i = 0; i < NORMAL_RECIPE_SLOTS.length; i++) {
            ItemStack recipeItem = slimefunItem.getRecipe()[i];

            if (recipeItem != null) {
                menu.addItem(NORMAL_RECIPE_SLOTS[i], recipeItem, (p, slot, item, action) -> {
                    SlimefunItem recipeSlimefunItem = SlimefunItem.getByItem(recipeItem);

                    if (recipeSlimefunItem != null) {
                        slimefunHistory.add(recipeSlimefunItem);
                        openSlimefunRecipe(player, entry, backID, slimefunHistory);
                    }
                    return false;
                });
            }

        }

        menu.addItem(NORMAL_RECIPE_TYPE, slimefunItem.getRecipeType().toItem(), ChestMenuUtils.getEmptyClickHandler());

        for (int slot : NORMAL_RECIPE_BACKGROUND) {
            menu.addItem(slot, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        menu.addItem(NORMAL_RECIPE_OUTPUT, output, ChestMenuUtils.getEmptyClickHandler());

        player.playSound(player.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1);
        menu.open(player);
    }

    @AllArgsConstructor
    private static final class BackEntry {

        private final BlockMenu bench;
        private final PlayerProfile profile;
        private final SlimefunGuideImplementation impl;

    }

    public static ItemStack OUTPUT_BORDER = new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, "&6输出");
    public static ItemStack INPUT_BORDER = new CustomItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE, "&b输入");
}