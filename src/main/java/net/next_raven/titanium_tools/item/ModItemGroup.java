package net.next_raven.titanium_tools.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.next_raven.titanium_tools.TitaniumToolsMain;

public class ModItemGroup {
    public static final ItemGroup Titanium = FabricItemGroupBuilder.build(
            new Identifier(TitaniumToolsMain.MOD_ID, "titanium"), () -> new ItemStack(ModItems.TITANIUM_INGOT));
}
