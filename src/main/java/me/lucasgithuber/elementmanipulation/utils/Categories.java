package me.lucasgithuber.elementmanipulation.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.category.DrugsGroup;
import me.lucasgithuber.elementmanipulation.category.JunctionGroup;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public class Categories {
    public static final ItemGroup ELEMENTS = new SubGroup(
            "em_elements",
            new CustomItemStack(new ItemStack(Material.PRISMARINE_SHARD), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#ff0000:#f4ff00>元素</gradient>")))
    );
    public static final ItemGroup MACHINES = new SubGroup(
            "em_machines",
            new CustomItemStack(new ItemStack(Material.BLAST_FURNACE), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#A3A3A3:#818181>机器</gradient>"))));
    public static final ItemGroup JUNCTION_CATEGORY = new JunctionGroup(
            ElementManipulation.createKey("junction_category"),
            new CustomItemStack(Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#A3A3A3:#FFFFFF>化工产品</gradient>"))),3);
    public static final ItemGroup DRUGS_CATEGORY = new DrugsGroup(
            ElementManipulation.createKey("drugs_category"),
            new CustomItemStack(Material.SUGAR, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#EDE342:#E85C90>药品</gradient>"))),4);

    public static final ItemGroup DIMENSIONS = new SubGroup(
            "em_dimensions",
            new CustomItemStack(new ItemStack(Material.RED_STAINED_GLASS), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<rainbow>维度</rainbow>"))));
    public static final ItemGroup MISCELLANEOUS = new SubGroup(
            "em_misc",
            new CustomItemStack(new ItemStack(Material.LIGHT_WEIGHTED_PRESSURE_PLATE), BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#ff0000:#f4ff00>杂项</gradient>")))
    );
    public static final ItemGroup INFO = new SubGroup(
            "em_info",
            new CustomItemStack(new ItemStack(Material.KNOWLEDGE_BOOK),
                    ChatColor.GREEN + "公告"
            ));
    public static final ItemGroup MAIN = new MultiGroup(
            "em_main",
            new CustomItemStack(Material.NETHERITE_BLOCK, BukkitComponentSerializer.legacy().serialize
                    (ElementManipulation.MM.deserialize("<gradient:#5e4fa2:#f79459>化学工程</gradient>"))),
            ELEMENTS, MACHINES, JUNCTION_CATEGORY, /*DRUGS_CATEGORY, DIMENSIONS, INFO,*/ MISCELLANEOUS
    );
    public static final ItemGroup JUNCTION_CHEAT = new SubGroup("junction_cheat",
            new CustomItemStack(Material.SMITHING_TABLE, "&b化工产品 &c- 无效配方"));
    public static final ItemGroup DRUGS_CHEAT = new SubGroup("drugs_cheat",
            new CustomItemStack(Material.SUGAR, "&b药品 &c- 无效配方"));

    public static void setup(ElementManipulation em){
        JUNCTION_CATEGORY.register(em);
        /*DRUGS_CATEGORY.register(em);*/
        MAIN.register(em);
        JUNCTION_CHEAT.register(em);
        /*DRUGS_CHEAT.register(em);*/
    }

}
