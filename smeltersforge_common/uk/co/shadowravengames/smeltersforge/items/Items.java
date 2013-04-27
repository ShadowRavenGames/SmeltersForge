package uk.co.shadowravengames.smeltersforge.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import uk.co.shadowravengames.smeltersforge.lib.ItemIds;
import uk.co.shadowravengames.smeltersforge.lib.Reference;

public class Items {
	
	// MAGNET
	public static Item ItemMagnet = (new ItemMagnet(ItemIds.MAGNET_DEFAULT));

	//BARS
	public static Item Bars = (new barItems(ItemIds.BARS_DEFAULT));
	// DUSTS
	public static Item Dusts = (new dustItems(ItemIds.DUSTS_DEFAULT));
	// CHUNKS
	public static Item Chunks = (new chunkItems(ItemIds.CHUNKS_DEFAULT));
	// LARGE CHUNKS
	public static Item LargeChunks = (new largeChunkItems(ItemIds.LARGE_CHUNKS_DEFAULT));

	// VANILLA
	public static Item VANILLA_Dusts = (new vanillaDustItems(ItemIds.VANILLA_DUSTS_DEFAULT));
	public static Item VANILLA_Chunks = (new vanillaChunkItems(ItemIds.VANILLA_CHUNKS_DEFAULT));
	public static Item VANILLA_LargeChunks = (new vanillaLargeChunkItems(ItemIds.VANILLA_LARGE_CHUNKS_DEFAULT));

	// LARGE CHUNKS
	public static Item CobbleChunk = (new CobbleChunkItem(ItemIds.COBBLE_CHUNK_DEFAULT));

	public static void init() {
				
		// VANILLA
		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, ItemIds.VANILLA_DUSTS_DEFAULT, 0), "Diamond Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, ItemIds.VANILLA_CHUNKS_DEFAULT, 0), "Diamond Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, ItemIds.VANILLA_LARGE_CHUNKS_DEFAULT, 0), "Large Diamond Chunk");

		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, ItemIds.VANILLA_DUSTS_DEFAULT, 1), "Iron Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, ItemIds.VANILLA_CHUNKS_DEFAULT, 1), "Iron Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, ItemIds.VANILLA_LARGE_CHUNKS_DEFAULT, 1), "Large Iron Chunk");

		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, ItemIds.VANILLA_DUSTS_DEFAULT, 2), "Gold Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, ItemIds.VANILLA_CHUNKS_DEFAULT, 2), "Gold Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, ItemIds.VANILLA_LARGE_CHUNKS_DEFAULT, 2), "Large Gold Chunk");

		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, ItemIds.VANILLA_DUSTS_DEFAULT, 3), "Emerald Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, ItemIds.VANILLA_CHUNKS_DEFAULT, 3), "Emerald Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, ItemIds.VANILLA_LARGE_CHUNKS_DEFAULT, 3), "Large Emerald Chunk");

		// BARS
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 0), "Sodium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 1), "Calcium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 2), "Magnesium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 3), "Aluminium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 4), "Zinc Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 5), "Lead Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 6), "Magnetite Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 7), "Titanium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 8), "Chromium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 9), "Cobalt Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 10), "Nickel Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 11), "Platinum Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 12), "Mercury Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 13), "Lithium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 14), "Plutonium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, ItemIds.BARS_DEFAULT, 15), "Arsenic Ingot");

		// DUSTS
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 0), "Sodium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 1), "Calcium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 2), "Magnesium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 3), "Aluminium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 4), "Zinc Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 5), "Lead Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 6), "Magnetite Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 7), "Titanium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 8), "Chromium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 9), "Cobalt Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 10), "Nickel Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 11), "Platinum Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 12), "Mercury Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 13), "Lithium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 14), "Plutonium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, ItemIds.DUSTS_DEFAULT, 15), "Arsenic Powder");
		
		// CHUNKS
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 0), "Sodium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 1), "Calcium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 2), "Magnesium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 3), "Aluminium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 4), "Zinc Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 5), "Lead Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 6), "Magnetite Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 7), "Titanium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 8), "Chromium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 9), "Cobalt Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 10), "Nickel Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 11), "Platinum Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 12), "Mercury Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 13), "Lithium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 14), "Plutonium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, ItemIds.CHUNKS_DEFAULT, 15), "Arsenic Chunk");
		
		// LARGE CHUNKS
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 0), "Large Sodium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 1), "Large Calcium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 2), "Large Magnesium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 3), "Large Aluminium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 4), "Large Zinc Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 5), "Large Lead Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 6), "Large Magnetite Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 7), "Large Titanium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 8), "Large Chromium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 9), "Large Cobalt Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 10), "Large Nickel Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 11), "Large Platinum Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 12), "Large Mercury Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 13), "Large Lithium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 14), "Large Plutonium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, ItemIds.LARGE_CHUNKS_DEFAULT, 15), "Large Arsenic Chunk");

		// MAGNET
		LanguageRegistry.addName(ItemMagnet, "Magnet");
		
		// COBBLE CHUNK
		LanguageRegistry.addName(CobbleChunk, "Cobblestone Chunk");
	}
}
