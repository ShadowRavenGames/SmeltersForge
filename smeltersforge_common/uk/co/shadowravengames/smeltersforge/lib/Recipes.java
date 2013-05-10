package uk.co.shadowravengames.smeltersforge.lib;

import uk.co.shadowravengames.smeltersforge.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes {
	public static void init() {

        for( int a = 0; a < 16; a++ ) {
        	GameRegistry.addRecipe(new ItemStack(Items.LargeChunks, 1, a), new Object[] {
        		"II", "II", "  ",
        		'I', new ItemStack(Items.Chunks, 1, a)
			});
        }

        for( int a = 0; a < 4; a++ ) {
        	GameRegistry.addRecipe(new ItemStack(Items.VANILLA_LargeChunks, 1, a), new Object[] {
        		"II", "II", "  ",
        		'I', new ItemStack(Items.VANILLA_Chunks, 1, a)
			});
        }
        
		GameRegistry.addRecipe(new ItemStack(Items.ItemMagnet, 1), new Object[] {
			"I I", "M M", "MMM",
			'I', Item.ingotIron,
			'M', new ItemStack(Items.Bars, 1, 6),
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.cobblestone, 1, 0), new Object[] {
			"CCC", "CCC", "CCC",
			'C', Items.CobbleChunk,
		});
		GameRegistry.addRecipe(new ItemStack(Block.stoneSingleSlab, 1, 3), new Object[] {
			"CCC",
			'C', Items.CobbleChunk,
		});
	}
}
