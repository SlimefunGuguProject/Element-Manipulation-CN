package me.lucasgithuber.elementmanipulation;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.lucasgithuber.elementmanipulation.machines.JunctionTable;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items{
    //machines

    public static final SlimefunItemStack EMDeconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<gradient:#000000:#FFFFFF>元素台</gradient>")), "&8将物品解构成元素", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));

    public static final SlimefunItemStack EMUltraCompressor = new SlimefunItemStack("EM_ULTRA_COMPRESSOR", Material.PISTON, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<gradient:#000000:#FFFFFF>Ultra compressor</gradient>")), "&8Used to compress elements", "&8Machine",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(4092, "/s"));


    public static final SlimefunItemStack EMJunctionTable= new SlimefunItemStack(
            "EM_JUNCTION_TABLE",
            Material.SMITHING_TABLE,
            "&a聚构机",
            "&7将元素聚构成物品",
            "",
            MachineLore.energy(4096) + "/物品"
    );

    public static void setup(ElementManipulation em) {
        new JunctionTable(Categories.EMMachines, EMJunctionTable, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_STAR),new ItemStack(Material.GLASS),new ItemStack(Material.NETHER_STAR),
                SlimefunItems.REINFORCED_PLATE,SlimefunItems.CRAFTING_MOTOR,SlimefunItems.REINFORCED_PLATE,
                new ItemStack(Material.BLACK_CONCRETE),SlimefunItems.LARGE_CAPACITOR,new ItemStack(Material.BLACK_CONCRETE),
        }, 4096).register(em);
    }

}