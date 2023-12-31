package net.sl33pypanda.donut;

import net.fabricmc.api.ModInitializer;

import net.sl33pypanda.donut.item.ModItemGroups;
import net.sl33pypanda.donut.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Donut implements ModInitializer {
	public static final String MOD_ID = "donut";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}