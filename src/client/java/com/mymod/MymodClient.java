package com.mymod;

import com.mymod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class MymodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModItems.registerModItems();
	}
}