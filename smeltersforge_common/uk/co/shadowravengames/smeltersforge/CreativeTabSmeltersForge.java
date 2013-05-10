package uk.co.shadowravengames.smeltersforge;

import uk.co.shadowravengames.smeltersforge.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabSmeltersForge extends CreativeTabs {

	public CreativeTabSmeltersForge(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)

	/**
	 * the itemID for the item to be displayed on the tab
	 */
	public int getTabIconItemIndex() {
		return Items.ItemMagnet.itemID;
	}

}