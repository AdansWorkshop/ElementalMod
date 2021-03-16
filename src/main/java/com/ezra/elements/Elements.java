package com.ezra.elements;

import com.ezra.elements.registry.ModBlocks;
import com.ezra.elements.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Elements implements ModInitializer {

	public static final String MOD_ID = "elements";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
