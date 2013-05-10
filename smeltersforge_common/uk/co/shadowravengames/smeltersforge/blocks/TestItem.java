package uk.co.shadowravengames.smeltersforge.blocks;

import uk.co.shadowravengames.smeltersforge.SmeltersForge;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TestItem extends ItemBlock {

	public TestItem(int i) {
		super(i);
		setCreativeTab(SmeltersForge.smeltersForgeTab);
	}

	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + ".test";
	}

}
