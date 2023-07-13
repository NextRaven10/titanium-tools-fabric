package net.next_raven.titanium_tools.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.next_raven.titanium_tools.TitaniumToolsMain;
import net.next_raven.titanium_tools.item.custom.CustomAxeItem;
import net.next_raven.titanium_tools.item.custom.CustomHoeItem;
import net.next_raven.titanium_tools.item.custom.CustomPickaxeItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModItems {

    //     Materials
    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));


    //      Rüstung
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_TURTLE_HELMET = registerItem("titanium_turtle_helmet",
            new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(TitaniumArmorMaterial.TITANIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));




    //      Tools
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(TitaniumToolMaterial.TITANIUM, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new CustomPickaxeItem(TitaniumToolMaterial.TITANIUM, 1, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new CustomAxeItem(TitaniumToolMaterial.TITANIUM, 5, -3f,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(TitaniumToolMaterial.TITANIUM, 1.5f, -3f,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));

    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new CustomHoeItem(TitaniumToolMaterial.TITANIUM, -5, 0f,
                    new FabricItemSettings().group(ModItemGroup.Titanium).fireproof()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TitaniumToolsMain.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TitaniumToolsMain.LOGGER.debug("Registering Mod Items for " + TitaniumToolsMain.MOD_ID);
    }
}
