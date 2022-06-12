package me.lucasgithuber.elementmanipulation.machines;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Machines{
    //machines

    public static final SlimefunItemStack EMDeconstructor = new SlimefunItemStack("EM_DECONSTRUCTOR", Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<gradient:#000000:#FFFFFF>物品解构机</gradient>")), "&8用于解构各种物品", "&8机器",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(128, "/s"));

    public static final SlimefunItemStack EMUltraCompressor = new SlimefunItemStack("EM_ULTRA_COMPRESSOR", Material.PISTON, BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<gradient:#000000:#FFFFFF>超静压缩机</gradient>")), "&8用于压缩元素", "&8机器",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(4092, "/s"));


    public static final SlimefunItemStack EMJunctionTable= new SlimefunItemStack(
            "EM_JUNCTION_TABLE",
            Material.SMITHING_TABLE,
            "&a元素链接台",
            "&7利用元素合成物品",
            "",
            MachineLore.energy(4096) + "/物品"
    );
    public static final SlimefunItemStack DRUGS_TABLE = new SlimefunItemStack(
            "EM_DRUGS_TABLE",
            Material.TINTED_GLASS,
            "&a医药台",
            "&7用于制作药品",
            "",
            MachineLore.energy(4096) + "/物品"
    );
    public static final SlimefunItemStack PORTAL_TABLE= new SlimefunItemStack(
            "EM_PORTAL_TABLE",
            Material.SMITHING_TABLE,
            BukkitComponentSerializer.legacy().serialize
            (ElementManipulation.MM.deserialize("<rainbow>任意门台</rainbow>")),
            "&7用于合成任意门",
            "",
            MachineLore.energy(8192) + "/物品"
    );
    public static final SlimefunItemStack ROCK_ANALYZER= new SlimefunItemStack(
            "EM_ROCK_ANALYZER",
            Material.LODESTONE,
            "&7岩石分析机",
            "&7分析岩石以获取固体元素",
            "&7例如过渡元素",
            "",
            MachineLore.energy(512) + "/t"
    );


    public static void setup(ElementManipulation em) {
        new Deconstructor(Categories.MACHINES, EMDeconstructor, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.POWER_CRYSTAL, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.POWER_CRYSTAL,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.REINFORCED_PLATE
        }).setProcessingSpeed(1).setCapacity(256).setEnergyConsumption(128).register(em);
        new JunctionTable(Categories.MACHINES, EMJunctionTable, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_STAR),new ItemStack(Material.GLASS),new ItemStack(Material.NETHER_STAR),
                SlimefunItems.REINFORCED_PLATE,SlimefunItems.CRAFTING_MOTOR,SlimefunItems.REINFORCED_PLATE,
                new ItemStack(Material.BLACK_CONCRETE),SlimefunItems.LARGE_CAPACITOR,new ItemStack(Material.BLACK_CONCRETE),
        }, 4096).register(em);
        new RockAnalyzer(Categories.MACHINES, ROCK_ANALYZER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_STAR),new ItemStack(Material.SPYGLASS),new ItemStack(Material.NETHER_STAR),
                SlimefunItems.REINFORCED_PLATE,new ItemStack(Material.GLASS),SlimefunItems.REINFORCED_PLATE,
                new ItemStack(Material.BLACK_CONCRETE),SlimefunItems.LARGE_CAPACITOR,new ItemStack(Material.BLACK_CONCRETE),
        }).setCapacity(2048).setEnergyConsumption(512).setProcessingSpeed(1).register(em);
        new UltraCompressor(Categories.MACHINES, Machines.EMUltraCompressor, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2,
                SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.GLASS), SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.REINFORCED_PLATE
        }).setProcessingSpeed(1).setCapacity(64).setEnergyConsumption(16);
        /*new DrugsTable(Categories.MACHINES, DRUGS_TABLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.NETHER_STAR), MiscItems.CLEAR_GLASS_3,new ItemStack(Material.NETHER_STAR),
                SlimefunItems.REINFORCED_PLATE,SlimefunItems.CRAFTING_MOTOR,SlimefunItems.REINFORCED_PLATE,
                new ItemStack(Material.BLACK_CONCRETE),SlimefunItems.LARGE_CAPACITOR,new ItemStack(Material.BLACK_CONCRETE),
        }, 4096).register(em);*/
        /*new PortalTable(Categories.MACHINES, PORTAL_TABLE, new ItemStack[] {
          *      null , null , null,
                null, new ItemStack(Material.DARK_OAK_FENCE), null,
                new ItemStack(Material.ENCHANTING_TABLE), new ItemStack(Material.DISPENSER), new ItemStack(Material.ENCHANTING_TABLE)
        }, BlockFace.SELF).register(em);*/
    }

}