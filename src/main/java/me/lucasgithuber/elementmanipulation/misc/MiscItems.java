package me.lucasgithuber.elementmanipulation.misc;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.lucasgithuber.elementmanipulation.items.Materials;

import static me.lucasgithuber.elementmanipulation.elements.Elements.*;

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
    public static final SlimefunItemStack SYRINGE = new SlimefunItemStack(
            "EM_SYRINGE",
            Material.END_ROD,
            "&f注射器",
            "&f用于麻醉剂"
    );
    public static final SlimefunItemStack RUBBER_PISTOL = new SlimefunItemStack(
            "EM_RUBBER_PISTOL",
            Material.COAL,
            "&f橡胶枪",
            "&f注射器部件"
    );
    public static void setup(ElementManipulation em){
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_1, RecipeType.SMELTERY, new ItemStack[]{
                CARBON,CARBON,CARBON,
                CARBON, new ItemStack(Material.GLASS_PANE), CARBON,
                CARBON,CARBON,CARBON,
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
        new UnplaceableBlock(Categories.MISCELLANEOUS, SYRINGE, RecipeType.SMELTERY, new ItemStack[]{
                SlimefunItems.PLASTIC_SHEET, null, SlimefunItems.PLASTIC_SHEET,
                SlimefunItems.PLASTIC_SHEET, null, SlimefunItems.PLASTIC_SHEET,
                SlimefunItems.PLASTIC_SHEET, RUBBER_PISTOL, SlimefunItems.PLASTIC_SHEET
        }).register(em);
        new SlimefunItem(Categories.MISCELLANEOUS, RUBBER_PISTOL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SULFUR,SULFUR,SULFUR,
                SULFUR,CARBON,SULFUR,
                SULFUR,SULFUR,SULFUR,
        }).register(em);
    }
}
