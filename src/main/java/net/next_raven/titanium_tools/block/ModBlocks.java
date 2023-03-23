package net.next_raven.titanium_tools.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.next_raven.titanium_tools.TitaniumToolsMain;
import net.next_raven.titanium_tools.item.ModItemGroup;

public class ModBlocks {


    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(10f).requiresTool()), ModItemGroup.Titanium);

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.Titanium);

    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.Titanium);




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TitaniumToolsMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {

        return Registry.register(Registry.ITEM, new Identifier(TitaniumToolsMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlock() {
        TitaniumToolsMain.LOGGER.debug("Registering ModBlocks for " + TitaniumToolsMain.MOD_ID);
    }
}
