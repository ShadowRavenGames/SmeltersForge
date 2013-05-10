package uk.co.shadowravengames.smeltersforge.blocks;

import uk.co.shadowravengames.smeltersforge.entities.OreTileEntity;
import uk.co.shadowravengames.smeltersforge.entities.TestTileEntity;
import uk.co.shadowravengames.smeltersforge.lib.BlockIds;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class Blocks {

	public static Block ores, glass, test;

	public static void init() {
		// Ore Generation
		ores = new OreBlocks(BlockIds.BLOCKS_DEFAULT, OreTileEntity.class).setUnlocalizedName("ore");
		GameRegistry.registerBlock(ores, OreItems.class, Reference.MOD_ID + ores.getUnlocalizedName().substring(5));

		LanguageRegistry.addName(new ItemStack(ores, 1, 0), "Sodium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 1), "Calcium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 2), "Magnesium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 3), "Aluminium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 4), "Zinc Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 5), "Lead Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 6), "Magnetite Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 7), "Titanium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 8), "Chromium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 9), "Cobalt Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 10), "Nickel Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 11), "Platinum Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 12), "Mercury Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 13), "Lithium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 14), "Plutonium Ore");
		LanguageRegistry.addName(new ItemStack(ores, 1, 15), "Arsenic Ore");

//		glass = new GlassBlocks(BlockIds.GLASS_DEFAULT, OreTileEntity.class).setUnlocalizedName("glass");
//		GameRegistry.registerBlock(glass, OreItems.class, Reference.MOD_ID + glass.getUnlocalizedName().substring(5));
//		LanguageRegistry.addName(new ItemStack(glass, 1, 1), "Stained Glass");
		
		test = new TestBlock(BlockIds.TEST_DEFAULT, TestTileEntity.class).setUnlocalizedName("testBlock");
		GameRegistry.registerBlock(test, TestItem.class, Reference.MOD_ID + test.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(new ItemStack(test, 1, 1), "Test Block");


	}
}
