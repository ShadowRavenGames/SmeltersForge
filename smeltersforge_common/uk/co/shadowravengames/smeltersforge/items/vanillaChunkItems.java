package uk.co.shadowravengames.smeltersforge.items;

import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class vanillaChunkItems extends Item {
	
	public static String[] chunkNames = {
		"Diamond Chunk",
		"Iron Chunk",
		"Gold Chunk",
		"Emerald Chunk"
	};
	
	public vanillaChunkItems(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1+32+76;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemDisplayName(par1ItemStack) + "." + chunkNames[var2];
    }
}
