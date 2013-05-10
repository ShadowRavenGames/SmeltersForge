package uk.co.shadowravengames.smeltersforge.lib;

import uk.co.shadowravengames.smeltersforge.blocks.Blocks;
import uk.co.shadowravengames.smeltersforge.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Smelting {
	public static void init() {
		for( int i = 0; i < 16; i++) {
			FurnaceRecipes.smelting().addSmelting(Blocks.ores.blockID, i,
					new ItemStack(Items.Bars, 1, i), 0.1f);
			
			FurnaceRecipes.smelting().addSmelting(Items.LargeChunks.itemID, i,
					new ItemStack(Items.Bars, 1, i), 0.1f);

			FurnaceRecipes.smelting().addSmelting(Items.Bars.itemID, i,
					new ItemStack(Items.Dusts, 1, i), 0.1f);
		}

		for( int i = 0; i < 4; i++) {
			int m = Item.diamond.itemID;
    		if(i == 0) {
    			m=Item.diamond.itemID;
    		}else if(i == 1) {
    			m=Item.ingotIron.itemID;
    		}else if(i == 2) {
    			m=Item.ingotGold.itemID;
    		}else if(i == 3) {
    			m=Item.emerald.itemID;
    		}
			
			FurnaceRecipes.smelting().addSmelting(Items.VANILLA_LargeChunks.itemID, i,
					new ItemStack(m, 1, i), 0.1f);

			FurnaceRecipes.smelting().addSmelting(m, i,
					new ItemStack(Items.VANILLA_Dusts, 1, i), 0.1f);
		}
	}
}
