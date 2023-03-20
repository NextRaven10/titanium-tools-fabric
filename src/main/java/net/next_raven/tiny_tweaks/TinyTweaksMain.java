package net.next_raven.tiny_tweaks;

import net.fabricmc.api.ModInitializer;

import net.next_raven.tiny_tweaks.block.ModBlocks;
import net.next_raven.tiny_tweaks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyTweaksMain implements ModInitializer {
	public static final String MOD_ID = "tiny-tweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

	}
}