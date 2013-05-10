package uk.co.shadowravengames.smeltersforge.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import uk.co.shadowravengames.smeltersforge.lib.ItemIds;

public class Items {
	
	// ENERGY CORE
	public static Item ItemEnergyCore = (new ItemEnergyCore(ItemIds.ENERGY_CORE_DEFAULT)).setUnlocalizedName("energycore");
	
	// MAGNET
	public static Item ItemMagnet = (new ItemMagnet(ItemIds.MAGNET_DEFAULT)).setUnlocalizedName("magnet");

	//BARS
	public static Item Bars = (new barItems(ItemIds.BARS_DEFAULT)).setUnlocalizedName("bars");
	// DUSTS
	public static Item Dusts = (new dustItems(ItemIds.DUSTS_DEFAULT)).setUnlocalizedName("dusts");
	// CHUNKS
	public static Item Chunks = (new chunkItems(ItemIds.CHUNKS_DEFAULT)).setUnlocalizedName("chunks");
	// LARGE CHUNKS
	public static Item LargeChunks = (new largeChunkItems(ItemIds.LARGE_CHUNKS_DEFAULT)).setUnlocalizedName("largechunks");

	// VANILLA
	public static Item VANILLA_Dusts = (new vanillaDustItems(ItemIds.VANILLA_DUSTS_DEFAULT)).setUnlocalizedName("dusts");
	public static Item VANILLA_Chunks = (new vanillaChunkItems(ItemIds.VANILLA_CHUNKS_DEFAULT)).setUnlocalizedName("chunks");
	public static Item VANILLA_LargeChunks = (new vanillaLargeChunkItems(ItemIds.VANILLA_LARGE_CHUNKS_DEFAULT)).setUnlocalizedName("largechunks");

	// LARGE CHUNKS
	public static Item CobbleChunk = (new CobbleChunkItem(ItemIds.COBBLE_CHUNK_DEFAULT)).setUnlocalizedName("cobblechunk");

	public static void init() {
				
		// VANILLA
		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, 1, 0), "Diamond Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, 1, 0), "Diamond Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, 1, 0), "Large Diamond Chunk");

		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, 1, 1), "Iron Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, 1, 1), "Iron Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, 1, 1), "Large Iron Chunk");

		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, 1, 2), "Gold Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, 1, 2), "Gold Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, 1, 2), "Large Gold Chunk");

		LanguageRegistry.addName(new ItemStack(VANILLA_Dusts, 1, 3), "Emerald Dust");
		LanguageRegistry.addName(new ItemStack(VANILLA_Chunks, 1, 3), "Emerald Chunk");
		LanguageRegistry.addName(new ItemStack(VANILLA_LargeChunks, 1, 3), "Large Emerald Chunk");

		// BARS
		LanguageRegistry.addName(new ItemStack(Bars, 1, 0), "Sodium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 1), "Calcium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 2), "Magnesium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 3), "Aluminium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 4), "Zinc Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 5), "Lead Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 6), "Magnetite Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 7), "Titanium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 8), "Chromium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 9), "Cobalt Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 10), "Nickel Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 11), "Platinum Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 12), "Mercury Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 13), "Lithium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 14), "Plutonium Ingot");
		LanguageRegistry.addName(new ItemStack(Bars, 1, 15), "Arsenic Ingot");

		// DUSTS
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 0), "Sodium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 1), "Calcium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 2), "Magnesium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 3), "Aluminium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 4), "Zinc Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 5), "Lead Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 6), "Magnetite Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 7), "Titanium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 8), "Chromium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 9), "Cobalt Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 10), "Nickel Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 11), "Platinum Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 12), "Mercury Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 13), "Lithium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 14), "Plutonium Powder");
		LanguageRegistry.addName(new ItemStack(Dusts, 1, 15), "Arsenic Powder");
		
		// CHUNKS
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 0), "Sodium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 1), "Calcium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 2), "Magnesium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 3), "Aluminium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 4), "Zinc Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 5), "Lead Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 6), "Magnetite Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 7), "Titanium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 8), "Chromium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 9), "Cobalt Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 10), "Nickel Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 11), "Platinum Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 12), "Mercury Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 13), "Lithium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 14), "Plutonium Chunk");
		LanguageRegistry.addName(new ItemStack(Chunks, 1, 15), "Arsenic Chunk");
		
		// LARGE CHUNKS
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 0), "Large Sodium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 1), "Large Calcium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 2), "Large Magnesium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 3), "Large Aluminium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 4), "Large Zinc Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 5), "Large Lead Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 6), "Large Magnetite Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 7), "Large Titanium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 8), "Large Chromium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 9), "Large Cobalt Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 10), "Large Nickel Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 11), "Large Platinum Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 12), "Large Mercury Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 13), "Large Lithium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 14), "Large Plutonium Chunk");
		LanguageRegistry.addName(new ItemStack(LargeChunks, 1, 15), "Large Arsenic Chunk");

		// MAGNET
		LanguageRegistry.addName(ItemMagnet, "Magnet");
		
		// COBBLE CHUNK
		LanguageRegistry.addName(CobbleChunk, "Cobblestone Chunk");

		// ENERGY CORE
		LanguageRegistry.addName(ItemEnergyCore, "Energy Core");
		
	}
}
