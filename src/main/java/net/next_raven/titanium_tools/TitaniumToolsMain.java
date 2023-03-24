package net.next_raven.titanium_tools;

import net.fabricmc.api.ModInitializer;

import net.next_raven.titanium_tools.block.ModBlocks;
import net.next_raven.titanium_tools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TitaniumToolsMain implements ModInitializer {
	public static final String MOD_ID = "titanium_tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

	}
}