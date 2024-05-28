package net.addie.randomstuff;

import net.addie.randomstuff.item.ModItemGroups;
import net.addie.randomstuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddiesRandomStuff implements ModInitializer {
	public static final String MOD_ID = "addiesrandomstuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Success!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}