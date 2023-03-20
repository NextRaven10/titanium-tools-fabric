package net.next_raven.tiny_tweaks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.next_raven.tiny_tweaks.TinyTweaksMain;
import net.next_raven.tiny_tweaks.item.ModItemGroup;

public class ModBlocks {


    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(10f).requiresTool().jumpVelocityMultiplier(10f)), ModItemGroup.Titanium);




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TinyTweaksMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        return Registry.register(Registry.ITEM, new Identifier(TinyTweaksMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlock() {
        TinyTweaksMain.LOGGER.debug("Registering ModBlocks for " + TinyTweaksMain.MOD_ID);
    }
}
