package me.lucasgithuber.elementmanipulation.elements;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.elements.WaterReactiveElement;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.utils.RecipeTypes;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Elements {
    public static final String NON_METALS =  "&a元素类别: 非金属元素";
    public static final String ALKALINES = "&a元素类别: 碱金属元素";
    public static final String HALOGENS = "&a元素类别: 卤族元素";
    public static final String ALKALINE_EARTH = "&a元素类别: 碱土金属元素";
    public static final String SEMI_METALS = "&a元素类别: 类金属元素";
    public static final String OTHER_METALS = "&a元素类别: 后过渡元素";
    public static final String TRANSITION_METALS = "&a元素类别: 过渡元素";
    public static final String NOBLE_GASSES = "&a元素类别: 稀有气体元素";
    //elements
    //non-metals
    public static final SlimefunItemStack HYDROGEN = new SlimefunItemStack(
            "EM_HYDROGEN",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>氢</gradient>")),
            "&8元素: H",
            "&8原子序数: 1",
            "&8相对原子质量: 1.008",
            NON_METALS);
    public static final SlimefunItemStack CARBON = new SlimefunItemStack(
            "EM_CARBON",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>碳</gradient>")),
            "&8元素: C",
            "&8原子序数: 6",
            "&8相对原子质量: 12.011",
            NON_METALS);
    public static final SlimefunItemStack NITROGEN = new SlimefunItemStack(
            "EM_NITROGEN",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>氮</gradient>")),
            "&8元素: N",
            "&8原子序数: 7",
            "&8相对原子质量: 14.007",
            NON_METALS,
            "&a右击\"un-breathe\" &7(仅主手生效)"
    );
    public static final SlimefunItemStack OXYGEN = new SlimefunItemStack(
            "EM_OXYGEN",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>氧</gradient>")),
            "&8元素: O",
            "&8原子序数: 8",
            "&8相对原子质量: 15.999",
            NON_METALS,
            "&a右击进行呼吸 &7(仅主手生效)");
    public static final SlimefunItemStack PHOSPHORUS = new SlimefunItemStack(
            "EM_PHOSPHORUS",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>磷</gradient>")),
            "&8元素: P",
            "&8原子序数: 15",
            "&8相对原子质量: 30.974",
            NON_METALS);
    public static final SlimefunItemStack SULFUR = new SlimefunItemStack(
            "SULFUR",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>硫</gradient>")),
            "&8元素: S",
            "&8原子序数: 16",
            "&8相对原子质量: 32.065",
            NON_METALS);
    public static final SlimefunItemStack SELENIUM = new SlimefunItemStack(
            "EM_SELENIUM",
            new ItemStack(Material.LIME_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>硒</gradient>")),
            "&8元素: Se",
            "&8原子序数: 34",
            "&8相对原子质量: 78.96",
            NON_METALS);


    //elements/碱金属
    public static final SlimefunItemStack LITHIUM = new SlimefunItemStack(
            "EM_LITHIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>锂</gradient>")),
            "&8元素: Li",
            "&8原子序数: 3",
            "&8相对原子质量: 6.941",
            ALKALINES
    );
    public static final SlimefunItemStack SODIUM = new SlimefunItemStack(
            "EM_SODIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>钠</gradient>")),
            "&8元素: Na",
            "&8原子序数: 11",
            "&8相对原子质量: 22.990",
            ALKALINES
    );
    public static final SlimefunItemStack POTASSIUM = new SlimefunItemStack(
            "EM_POTASSIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>钾</gradient>")),
            "&8元素: K",
            "&8原子序数: 19",
            "&8相对原子质量: 39.098",
            ALKALINES
    );
    public static final SlimefunItemStack RUBIDIUM = new SlimefunItemStack(
            "EM_RUBIDIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>铷</gradient>")),
            "&8元素: Rb",
            "&8原子序数: 37",
            "&8相对原子质量: 85.468",
            ALKALINES
    );
    public static final SlimefunItemStack CAESIUM = new SlimefunItemStack(
            "EM_CAESIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>铯</gradient>")),
            "&8元素: Cs",
            "&8原子序数: 55",
            "&8相对原子质量: 132.905",
            ALKALINES
    );
    public static final SlimefunItemStack FRANCIUM = new SlimefunItemStack(
            "EM_FRANCIUM",
            new ItemStack(Material.ORANGE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#F3A33B:#FF953E>钫</gradient>")),
            "&8元素: Fr",
            "&8原子序数: 87",
            "&8相对原子质量: [223]",
            ALKALINES
    );

    //elements/halogens
    public static final SlimefunItemStack FLUORINE = new SlimefunItemStack(
            "EM_FLUORINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>氟</gradient>")),
            "&8元素: F",
            "&8原子序数: 9",
            "&8相对原子质量: 19.998",
            HALOGENS
    );
    public static final SlimefunItemStack CHLORINE = new SlimefunItemStack(
            "EM_CHANGE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>氯</gradient>")),
            "&8元素: Cl",
            "&8原子序数: 17",
            "&8相对原子质量: 35.453",
            HALOGENS
    );
    public static final SlimefunItemStack BROMINE = new SlimefunItemStack(
            "EM_BROMINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>溴</gradient>")),
            "&8元素: Br",
            "&8原子序数: 35",
            "&8相对原子质量: 79.904",
            HALOGENS
    );
    public static final SlimefunItemStack IODINE = new SlimefunItemStack(
            "EM_IODINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>碘</gradient>")),
            "&8元素: I",
            "&8原子序数: 53",
            "&8相对原子质量: 126.904 47",
            HALOGENS
    );
    public static final SlimefunItemStack ASTATINE = new SlimefunItemStack(
            "EM_ASTATINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>砹</gradient>")),
            "&8元素: At",
            "&8原子序数: 85",
            "&8相对原子质量: [210]",
            HALOGENS
    );
    public static final SlimefunItemStack TENNESSINE = new SlimefunItemStack(
            "EM_TENNESSINE",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EEFF00:#97FFE5>石田</gradient>")),
            "&8元素: Ts",
            "&8原子序数: 117",
            "&8相对原子质量: [294]",
            HALOGENS
    );

    //elements/alkaline-earths
    public static final SlimefunItemStack BERYLLIUM = new SlimefunItemStack(
            "EM_BERYLLIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>铍</gradient>")),
            "&8元素: Be",
            "&8原子序数: 4",
            "&8相对原子质量: 9.012",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack MAGNESIUM = new SlimefunItemStack(
            "EM_MAGNESIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>镁</gradient>")),
            "&8元素: Mg",
            "&8原子序数: 12",
            "&8相对原子质量: 24.305",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack CALCIUM = new SlimefunItemStack(
            "EM_CALCIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>钙</gradient>")),
            "&8元素: Ca",
            "&8原子序数: 20",
            "&8相对原子质量: 40.078",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack STRONTIUM = new SlimefunItemStack(
            "EM_STRONTIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>锶</gradient>")),
            "&8元素: Sr",
            "&8原子序数: 38",
            "&8相对原子质量: 87.62",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack BARIUM = new SlimefunItemStack(
            "EM_BARIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>钡</gradient>")),
            "&8元素: Ba",
            "&8原子序数: 56",
            "&8相对原子质量: 137.327",
            ALKALINE_EARTH
    );
    public static final SlimefunItemStack RADIUM = new SlimefunItemStack(
            "EM_RADIUM",
            new ItemStack(Material.YELLOW_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#EDE342:#BBB816>镭</gradient>")),
            "&8元素: Ra",
            "&8原子序数: 88",
            "&8相对原子质量: [226]",
            ALKALINE_EARTH
    );
    //elements/semi-metals
    public static final SlimefunItemStack BORON = new SlimefunItemStack(
            "EM_BORON",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>硼</gradient>")),
            "&8元素: B",
            "&8原子序数: 5",
            "&8相对原子质量: 10.811",
            SEMI_METALS
    );
    public static final SlimefunItemStack SILICON = new SlimefunItemStack(
            "EM_SILICON",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>硅</gradient>")),
            "&8元素: Si",
            "&8原子序数: 14",
            "&8相对原子质量: 28.086",
            SEMI_METALS
    );
    public static final SlimefunItemStack GERMANIUM = new SlimefunItemStack(
            "EM_GERMANIUM",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>锗</gradient>")),
            "&8元素: Ge",
            "&8原子序数: 32",
            "&8相对原子质量: 72.64",
            SEMI_METALS
    );
    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
            "EM_ARSENIC",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>砷</gradient>")),
            "&8元素: As",
            "&8原子序数: 33",
            "&8相对原子质量: 74.922",
            SEMI_METALS
    );
    public static final SlimefunItemStack ANTIMONY = new SlimefunItemStack(
            "EM_ANTIMONY",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>锑</gradient>")),
            "&8元素: Sb",
            "&8原子序数: 51",
            "&8相对原子质量: 121.76",
            SEMI_METALS
    );
    public static final SlimefunItemStack TELLURIUM = new SlimefunItemStack(
            "EM_TELLURIUM",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>碲</gradient>")),
            "&8元素: Te",
            "&8原子序数: 52",
            "&8相对原子质量: 127.6",
            SEMI_METALS
    );
    public static final SlimefunItemStack POLONIUM = new SlimefunItemStack(
            "EM_POLONIUM",
            new ItemStack(Material.LIGHT_BLUE_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>钋</gradient>")),
            "&8元素: Po",
            "&8原子序数: 84",
            "&8相对原子质量: [210]",
            SEMI_METALS
    );
    //elements/others
    public static final SlimefunItemStack ALUMINUM = new SlimefunItemStack(
            "EM_ALUMINUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>铝</gradient>")),
            "&8元素: Al",
            "&8原子序数: 13",
            "&8相对原子质量: 26.982",
            OTHER_METALS
    );
    public static final SlimefunItemStack GALLIUM = new SlimefunItemStack(
            "EM_GALLIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>镓</gradient>")),
            "&8元素: Ga",
            "&8原子序数: 31",
            "&8相对原子质量: 69.723",
            OTHER_METALS
    );
    public static final SlimefunItemStack INDIUM = new SlimefunItemStack(
            "EM_INDIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>铟</gradient>")),
            "&8元素: In",
            "&8原子序数: 49",
            "&8相对原子质量: 114.818",
            OTHER_METALS
    );
    public static final SlimefunItemStack THALLIUM = new SlimefunItemStack(
            "EM_THALLIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>铊</gradient>")),
            "&8元素: Tl",
            "&8原子序数: 81",
            "&8相对原子质量: 204.383",
            OTHER_METALS
    );
    public static final SlimefunItemStack NIHONIUM = new SlimefunItemStack(
            "EM_NIHONIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>鉨</gradient>")),
            "&8元素: Nh",
            "&8原子序数: 113",
            "&8相对原子质量: [284]",
            OTHER_METALS
    );
    public static final SlimefunItemStack TIN = new SlimefunItemStack(
            "EM_TIN",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>锡</gradient>")),
            "&8元素: Sn",
            "&8原子序数: 50",
            "&8相对原子质量: 118.71",
            OTHER_METALS
    );
    public static final SlimefunItemStack LEAD = new SlimefunItemStack(
            "EM_LEAD",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>铅</gradient>")),
            "&8元素: Pb",
            "&8原子序数: 82",
            "&8相对原子质量: 207.2",
            OTHER_METALS
    );
    public static final SlimefunItemStack FLEROVIUM = new SlimefunItemStack(
            "EM_FLEROVIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>鈇</gradient>")),
            "&8元素: Fl",
            "&8原子序数: 114",
            "&8相对原子质量: [289]",
            OTHER_METALS
    );
    public static final SlimefunItemStack BISMUTH = new SlimefunItemStack(
            "EM_BISMUTH",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>铋</gradient>")),
            "&8元素: Bi",
            "&8原子序数: 83",
            "&8相对原子质量: 208.98",
            OTHER_METALS
    );
    public static final SlimefunItemStack MOSCOVIUM = new SlimefunItemStack(
            "EM_MOSCOVIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>镆</gradient>")),
            "&8元素: Mc",
            "&8原子序数: 115",
            "&8相对原子质量: [288]",
            OTHER_METALS
    );
    public static final SlimefunItemStack LIVERMORIUM = new SlimefunItemStack(
            "EM_LIVERMORIUM",
            new ItemStack(Material.GRAY_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#8B8B8B:#6E6E6E>鉝</gradient>")),
            "&8元素: Lv",
            "&8原子序数: 116",
            "&8相对原子质量: [293]",
            OTHER_METALS
    );

    //elements/transition metals
    public static final SlimefunItemStack SCANDIUM = new SlimefunItemStack(
            "EM_SCANDIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钪</gradient>")),
            "&8元素: Sc",
            "&8原子序数: 21",
            "&8相对原子质量: 44.956",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack VANADIUM = new SlimefunItemStack(
            "EM_VANADIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钒</gradient>")),
            "&8元素: V",
            "&8原子序数: 23",
            "&8相对原子质量: 50.942",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack CHROMIUM = new SlimefunItemStack(
            "EM_CHROMIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铬</gradient>")),
            "&8元素: Cr",
            "&8原子序数: 24",
            "&8相对原子质量: 51.996",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MANGANESE = new SlimefunItemStack(
            "EM_MANGANESE",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>锰</gradient>")),
            "&8元素: Mn",
            "&8原子序数: 25",
            "&8相对原子质量: 54.938",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack IRON = new SlimefunItemStack(
            "EM_IRON",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铁</gradient>")),
            "&8元素: Fe",
            "&8原子序数: 26",
            "&8相对原子质量: 55.845",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack COBALT = new SlimefunItemStack(
            "EM_COBALT",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钴</gradient>")),
            "&8元素: Co",
            "&8原子序数: 27",
            "&8相对原子质量: 58.933",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack NICKEL = new SlimefunItemStack(
            "EM_NICKEL",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>镍</gradient>")),
            "&8元素: Ni",
            "&8原子序数: 28",
            "&8相对原子质量: 58.693",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack COPPER = new SlimefunItemStack(
            "EM_COPPER",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铜</gradient>")),
            "&8元素: Cu",
            "&8原子序数: 29",
            "&8相对原子质量: 63.546",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack ZINC = new SlimefunItemStack(
            "EM_ZINC",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>锌</gradient>")),
            "&8元素: Zn",
            "&8原子序数: 30",
            "&8相对原子质量: 65.409",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack YTTRIUM = new SlimefunItemStack(
            "EM_YTTRIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钇</gradient>")),
            "&8元素: Y",
            "&8原子序数: 39",
            "&8相对原子质量: 88.906",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack ZIRCONIUM = new SlimefunItemStack(
            "EM_ZIRCONIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>锆</gradient>")),
            "&8元素: Zr",
            "&8原子序数: 40",
            "&8相对原子质量: 91.224",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack NIOBIUM = new SlimefunItemStack(
            "EM_NIOBIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铌</gradient>")),
            "&8元素: Nb",
            "&8原子序数: 41",
            "&8相对原子质量: 92.906",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MOLYBDENUM = new SlimefunItemStack(
            "EM_MOLYBDENUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钼</gradient>")),
            "&8元素: Mo",
            "&8原子序数: 42",
            "&8相对原子质量: 95.94",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack TECHNETIUM = new SlimefunItemStack(
            "EM_TECHNETIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>锝</gradient>")),
            "&8元素: Tc",
            "&8原子序数: 43",
            "&8相对原子质量: [98]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RUTHENIUM = new SlimefunItemStack(
            "EM_RUTHENIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钌</gradient>")),
            "&8元素: Ru",
            "&8原子序数: 44",
            "&8相对原子质量: 101.07",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RHODIUM = new SlimefunItemStack(
            "EM_RHODIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铑</gradient>")),
            "&8元素: Rh",
            "&8原子序数: 45",
            "&8相对原子质量: 102.905 50",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack PALLADIUM = new SlimefunItemStack(
            "EM_PALLADIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钯</gradient>")),
            "&8元素: Pd",
            "&8原子序数: 46",
            "&8相对原子质量: 106.42",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack SILVER = new SlimefunItemStack(
            "EM_SILVER",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>银</gradient>")),
            "&8元素: Ag",
            "&8原子序数: 47",
            "&8相对原子质量: 107.868",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack CADMIUM = new SlimefunItemStack(
            "EM_CADMIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>镉</gradient>")),
            "&8元素: Cd",
            "&8原子序数: 48",
            "&8相对原子质量: 112.411",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack HAFNIUM = new SlimefunItemStack(
            "EM_HAFNIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铪</gradient>")),
            "&8元素: Hf",
            "&8原子序数: 72",
            "&8相对原子质量: 178.49",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack TANTALUM = new SlimefunItemStack(
            "EM_TANTALUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钽</gradient>")),
            "&8元素: Ta",
            "&8原子序数: 73",
            "&8相对原子质量: 180.948",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack TUNGSTEN = new SlimefunItemStack(
            "EM_TUNGSTEN",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钨</gradient>")),
            "&8元素: W",
            "&8原子序数: 74",
            "&8相对原子质量: 183.84",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RHENIUM = new SlimefunItemStack(
            "EM_RHENIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>铼</gradient>")),
            "&8元素: Re",
            "&8原子序数: 75",
            "&8相对原子质量: 186.207",
            TRANSITION_METALS
    );

    public static final SlimefunItemStack PLATINUM = new SlimefunItemStack(
            "EM_PLATINUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>锇</gradient>")),
            "&8元素: Pt",
            "&8原子序数: 78",
            "&8相对原子质量: 195.084",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack GOLD = new SlimefunItemStack(
            "EM_GOLD",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>金</gradient>")),
            "&8元素: Au",
            "&8原子序数: 79",
            "&8相对原子质量: 196.967",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MERCURY = new SlimefunItemStack(
            "EM_MERCURY",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>汞</gradient>")),
            "&8元素: Hg",
            "&8原子序数: 80",
            "&8相对原子质量: 200.59",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack RUTHERFORDIUM = new SlimefunItemStack(
            "EM_RUTHERFORDIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
            "<gradient:#f08080:#ffdab9>钅卢</gradient>")),
            "&8元素: Rf",
            "&8原子序数: 104",
            "&8相对原子质量: 261",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack DUBNIUM = new SlimefunItemStack(
            "EM_DUBNIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钅杜</gradient>")),
            "&8元素: Db",
            "&8原子序数: 105",
            "&8相对原子质量: [262]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack SEABORGIUM = new SlimefunItemStack(
            "EM_SEABORGIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>𨭎</gradient>")),
            "&8元素: Sg",
            "&8原子序数: 106",
            "&8相对原子质量: [266]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack BOHRIUM = new SlimefunItemStack(
            "EM_BOHRIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钅波</gradient>")),
            "&8元素: Bh",
            "&8原子序数: 107",
            "&8相对原子质量: [264]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack HASSIUM = new SlimefunItemStack(
            "EM_HASSIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>钅黑</gradient>")),
            "&8元素: Hs",
            "&8原子序数: 108",
            "&8相对原子质量: [277]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack MEITNERIUM = new SlimefunItemStack(
            "EM_MEITNERIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>䥑</gradient>")),
            "&8元素: Mt",
            "&8原子序数: 109",
            "&8相对原子质量: [268]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack DARMSTADTIUM = new SlimefunItemStack(
            "EM_DARMSTADTIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9> 钅达</gradient>")),
            "&8元素: Ds",
            "&8原子序数: 110",
            "&8相对原子质量: [271]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack ROENTGENIUM = new SlimefunItemStack(
            "EM_ROENTGENIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#f08080:#ffdab9>錀</gradient>")),
            "&8元素: Rg",
            "&8原子序数: 111",
            "&8相对原子质量: [272]",
            TRANSITION_METALS
    );
    public static final SlimefunItemStack COPERNICIUM = new SlimefunItemStack(
            "EM_COPERNICIUM",
            new ItemStack(Material.MAGENTA_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#38CA08:#25FF09>鎶</gradient>")),
            "&8元素: Cn",
            "&8原子序数: 112",
            "&8相对原子质量: [277]",
            TRANSITION_METALS
    );
    //elements/noble-gasses
    public static final SlimefunItemStack HELIUM = new SlimefunItemStack(
            "EM_HELIUM",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>氦</gradient>")),
            "&8元素: He",
            "&8原子序数: 2",
            "&8相对原子质量: 4.008",
            NOBLE_GASSES,
            "&a右击漂浮 &7(仅主手生效)"
    );
    public static final SlimefunItemStack NEON = new SlimefunItemStack(
            "EM_NEON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>氖</gradient>")),
            "&8元素: Ne",
            "&8原子序数: 10",
            "&8相对原子质量: 20.18",
            NOBLE_GASSES,
            "&a右击告示牌并使其发光 &7(仅主手生效)"
    );
    public static final SlimefunItemStack ARGON = new SlimefunItemStack(
            "EM_ARGON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>氩</gradient>")),
            "&8元素: Ar",
            "&8原子序数: 18",
            "&8相对原子质量: 39.948",
            NOBLE_GASSES
    );
    public static final SlimefunItemStack KRYPTON = new SlimefunItemStack(
            "EM_KRYPTON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>氪</gradient>")),
            "&8元素:  Kr",
            "&8原子序数: 36",
            "&8相对原子质量: 83.798",
            NOBLE_GASSES
    );
    public static final SlimefunItemStack XENON = new SlimefunItemStack(
            "EM_XENON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>氙</gradient>")),
            "&8元素: Xe",
            "&8原子序数: 54",
            "&8相对原子质量: 131.293",
            NOBLE_GASSES
    );
    public static final SlimefunItemStack RADON = new SlimefunItemStack(
            "EM_RADON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>氡</gradient>")),
            "&8元素: Rn",
            "&8原子序数: 86",
            "&8相对原子质量: [220]",
            NOBLE_GASSES,
            "&a屏住呼吸 &7(仅主手生效)"
    );
    public static final SlimefunItemStack OGANESSON = new SlimefunItemStack(
            "EM_OGANESSON",
            new ItemStack(Material.CYAN_DYE),
            BukkitComponentSerializer.legacy().serialize(ElementManipulation.MM.deserialize(
                    "<gradient:#0097B1:#51BFD89>奥气</gradient>")),
            "&8元素: Og",
            "&8原子序数: 118",
            "&8相对原子质量: [294]",
            NOBLE_GASSES
    );

    public static void setup(ElementManipulation em) {

        new Oxygen(Categories.ELEMENTS, OXYGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, HYDROGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CARBON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new Nitrogen(Categories.ELEMENTS, NITROGEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, PHOSPHORUS, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SELENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SULFUR, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //alkalines
        new WaterReactiveElement(Categories.ELEMENTS, LITHIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new WaterReactiveElement(Categories.ELEMENTS, SODIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new WaterReactiveElement(Categories.ELEMENTS, POTASSIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new WaterReactiveElement(Categories.ELEMENTS, RUBIDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new WaterReactiveElement(Categories.ELEMENTS, CAESIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new WaterReactiveElement(Categories.ELEMENTS, FRANCIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //halogens
        new ChemicalElements(Categories.ELEMENTS, FLUORINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CHLORINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BROMINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, IODINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ASTATINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TENNESSINE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //alkaline earths
        new ChemicalElements(Categories.ELEMENTS, BERYLLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MAGNESIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, STRONTIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CALCIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BARIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //semi-metals
        new ChemicalElements(Categories.ELEMENTS, BORON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SILICON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, GERMANIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ARSENIC, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ANTIMONY, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TELLURIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, POLONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);

        //others

        new ChemicalElements(Categories.ELEMENTS, ALUMINUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, GALLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, INDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, THALLIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, NIHONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TIN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, LEAD, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, FLEROVIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BISMUTH, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MOSCOVIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, LIVERMORIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);

        //transition-metals

        new ChemicalElements(Categories.ELEMENTS, SILVER, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, COPPER, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, GOLD, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SCANDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, VANADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RHODIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CHROMIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MANGANESE, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, IRON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, COBALT, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, NICKEL, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ZINC, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, YTTRIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, NIOBIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MOLYBDENUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, PALLADIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RUTHENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, CADMIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, HAFNIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TANTALUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TUNGSTEN, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RHENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);


        new ChemicalElements(Categories.ELEMENTS, PLATINUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MERCURY, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, RUTHERFORDIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, DUBNIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, SEABORGIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, BOHRIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, HASSIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, MEITNERIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, DARMSTADTIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ROENTGENIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, COPERNICIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ZIRCONIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, TECHNETIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        //noble gasses
        new Helium(Categories.ELEMENTS, HELIUM, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new Neon(Categories.ELEMENTS, NEON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, ARGON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, KRYPTON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, XENON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new Radon(Categories.ELEMENTS, RADON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
        new ChemicalElements(Categories.ELEMENTS, OGANESSON, RecipeTypes.EM_DECONSTRUCTOR, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(em);
    }
}

