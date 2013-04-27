package uk.co.shadowravengames.smeltersforge.items;

import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class dustItems extends Item {
	
	public static String[] dustNames = {
		"Sodium Powder",
		"Calcium Powder",
		"Magnesium Powder",
		"Aluminium Powder",
		"Zinc Powder",
		"Lead Powder",
		"Magnetite Powder",
		"Titanium Powder",
		"Chromium Powder",
		"Cobalt Powder",
		"Nickel Powder",
		"Platinum Powder",
		"Mercury Powder",
		"Lithium Powder",
		"Plutonium Powder",
		"Arsenic Powder",
	};
	
	public dustItems(int i) {
		super(i);
	    setTextureFile(Reference.ITEM_SPRITE_SHEET);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemDisplayName(par1ItemStack) + "." + dustNames[var2];
    }
}
