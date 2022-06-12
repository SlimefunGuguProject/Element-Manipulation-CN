package me.lucasgithuber.elementmanipulation.items;

import io.github.bakedlibs.dough.skins.PlayerHead;
import io.github.bakedlibs.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.machines.PortalTable;
import me.lucasgithuber.elementmanipulation.utils.BigLore;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import me.lucasgithuber.elementmanipulation.utils.Util;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


public class PortalCorners {
 static final SlimefunItemStack TOP_LEFT_PORTAL = new SlimefunItemStack(
            "EM_TOP_LEFT_PORTAL",
            new ItemStack(Material.GOLD_NUGGET),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF0000:#B60E4F>任意门在左上角</gradient>")),
            "",
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF0000:#B60E4F>左上角的任意门是穿越维度的入口</gradient>")),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#FF0000:#B60E4F>它负责让另一个维度变得更具有物理性</gradient>"))
    );

    public static void setup(ElementManipulation em){
        SlimefunItem dimensionsInfo = new SlimefunItem(
                Categories.INFO,
                Util.bigLoreItem(
                "EM_INFO_DIMENSIONS",
                PlayerHead.getItemStack(PlayerSkin.fromHashCode("d7c9b88ed3060bbef34a78f120dfe20bf76b982211fc46c640188b1517e196e2")),
                ChatColor.GREEN + "如何去其他维度",
                BigLore.INFO_DIMENSIONS,
                ChatColor.of("#192371"),
                "为了去其他维度",
                "你必须在你放置的物品解构机中",
                "解构任意一个物品262144次",
                "",
                "例如，你必须在物品解构机的输入槽中",
                "放入胡萝卜262144次"
                ),
                RecipeTypes.INFO,
                new ItemStack[]{}
        );
        dimensionsInfo.register(em);
        new SlimefunItem(Categories.DIMENSIONS, TOP_LEFT_PORTAL, PortalTable.PORTAL_TABLE_RECIPETYPE, new ItemStack[]{
        }).register(em);

    }
}
