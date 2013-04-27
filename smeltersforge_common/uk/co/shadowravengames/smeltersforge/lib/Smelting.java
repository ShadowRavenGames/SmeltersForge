package uk.co.shadowravengames.smeltersforge.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Smelting {
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(BlockIds.BLOCKS_DEFAULT, 1, 6).itemID, new ItemStack(ItemIds.BARS_DEFAULT, 1, 6), 64f);
		GameRegistry.addSmelting(new ItemStack(ItemIds.LARGE_CHUNKS_DEFAULT, 1, 6).itemID, new ItemStack(ItemIds.BARS_DEFAULT, 1, 6), 64f);
	}
}
