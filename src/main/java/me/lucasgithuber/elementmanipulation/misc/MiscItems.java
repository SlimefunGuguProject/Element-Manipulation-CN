package me.lucasgithuber.elementmanipulation.misc;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MiscItems {
    public static final SlimefunItemStack CLEAR_GLASS_1 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_1",
            Material.GLASS_PANE,
            "&8光学玻璃 &7(33%)",
            "&8这种玻璃比普通的玻璃更加透明",
            "&8因为热量拆散了它的共价键"
    );
    public static final SlimefunItemStack CLEAR_GLASS_2 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_2",
            Material.GLASS_PANE,
            "&7光学玻璃 &7(66%)",
            "&8这种玻璃比普通的玻璃更加透明",
            "&8因为热量拆散了它的共价键" 
    );
    public static final SlimefunItemStack CLEAR_GLASS_3 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_3",
            Material.GLASS_PANE,
            "&f光学玻璃",
            "&f它已经透明到一定程度了",
            "&f你甚至无法感知它的存在"
    );
    public static void setup(ElementManipulation em){
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_1, RecipeType.SMELTERY, new ItemStack[]{
                new ItemStack(Material.GLASS_PANE), null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_2, RecipeType.SMELTERY, new ItemStack[]{
                CLEAR_GLASS_1, null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_3, RecipeType.SMELTERY, new ItemStack[]{
                CLEAR_GLASS_2, null, null,
                null, null, null,
                null, null, null
        }).register(em);
    }
}
