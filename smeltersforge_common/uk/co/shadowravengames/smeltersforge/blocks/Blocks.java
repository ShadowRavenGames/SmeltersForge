package uk.co.shadowravengames.smeltersforge.blocks;

import uk.co.shadowravengames.smeltersforge.lib.BlockIds;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import uk.co.shadowravengames.smeltersforge.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class Blocks {

	// ORES
	public static Block Blocks = (new OreBlocks(BlockIds.BLOCKS_DEFAULT));
	
	public static void init() {
		// Ore Generation
		GameRegistry.registerBlock(Blocks, Strings.ORE_BLOCK_NAME);
		
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 0), "Sodium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 1), "Calcium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 2), "Magnesium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 3), "Aluminium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 4), "Zinc Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 5), "Lead Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 6), "Magnetite Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 7), "Titanium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 8), "Chromium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 9), "Cobalt Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 10), "Nickel Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 11), "Platinum Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 12), "Mercury Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 13), "Lithium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 14), "Plutonium Ore");
		LanguageRegistry.addName(new ItemStack(Blocks, BlockIds.BLOCKS_DEFAULT, 15), "Arsenic Ore");
	}
}
