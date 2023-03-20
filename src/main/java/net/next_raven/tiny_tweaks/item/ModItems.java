package net.next_raven.tiny_tweaks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.next_raven.tiny_tweaks.TinyTweaksMain;

public class ModItems {

    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium)));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).maxCount(32)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TinyTweaksMain.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TinyTweaksMain.LOGGER.debug("Registering Mod Items for " + TinyTweaksMain.MOD_ID);
    }
}
