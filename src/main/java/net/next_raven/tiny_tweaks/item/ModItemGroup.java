package net.next_raven.tiny_tweaks.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.next_raven.tiny_tweaks.TinyTweaksMain;

public class ModItemGroup {
    public static final ItemGroup Titanium = FabricItemGroupBuilder.build(
            new Identifier(TinyTweaksMain.MOD_ID, "titanium"), () -> new ItemStack(ModItems.TITANIUM_INGOT));
}
