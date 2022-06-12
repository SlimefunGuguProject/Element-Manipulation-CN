package me.lucasgithuber.elementmanipulation.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.machines.Machines;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class RecipeTypes {
    public static final SlimefunItemStack INFO_BOOK = new SlimefunItemStack(
            "INFO_BOOK",
            Material.BOOK,
            ChatColor.GREEN + "告示书",
            ChatColor.DARK_GREEN + "它可以告诉你关于该附属的基本信息"
    );
    public static final RecipeType EM_DECONSTRUCTOR = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_deconstructor_recipetype"), Machines.EMDeconstructor, "", "&8通过物品解构机提取");
    public static final RecipeType INFO = new RecipeType(new NamespacedKey(ElementManipulation.i(), "em_info_recipetype"), INFO_BOOK, "", ChatColor.DARK_GREEN + "这是一本告示书, 你必须按照 \"recipe\" 告诉你的去做");
}
