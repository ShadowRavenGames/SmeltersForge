package uk.co.shadowravengames.smeltersforge.lib;

import uk.co.shadowravengames.smeltersforge.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes {
	public static void init() {
		GameRegistry.addRecipe(new ItemStack(ItemIds.LARGE_CHUNKS_DEFAULT, 1, 6), new Object[] {
			"II",
			'I', new ItemStack(ItemIds.CHUNKS_DEFAULT, 1, 6)
		});
		GameRegistry.addRecipe(new ItemStack(Items.ItemMagnet, 1), new Object[] {
			"I I", "M M", "MMM",
			'I', Item.ingotIron,
			'M', new ItemStack(ItemIds.BARS_DEFAULT, 1, 6),
		});
	}
}
