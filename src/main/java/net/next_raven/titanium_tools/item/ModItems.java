package net.next_raven.titanium_tools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.next_raven.titanium_tools.TitaniumToolsMain;

public class ModItems {

    //     Materialen
    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));


    //      Rüstung
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_HELMET_W = registerItem("titanium_helmet_w",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));


    //      Tools
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TitaniumToolsMain.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TitaniumToolsMain.LOGGER.debug("Registering Mod Items for " + TitaniumToolsMain.MOD_ID);
    }
}
