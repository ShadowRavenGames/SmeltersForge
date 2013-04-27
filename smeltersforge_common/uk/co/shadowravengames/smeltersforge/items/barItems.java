package uk.co.shadowravengames.smeltersforge.items;

import java.util.Random;

import uk.co.shadowravengames.smeltersforge.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class barItems extends Item {
	
	public static String[] blockNames = {
		"Sodium Ingot",
		"Calcium Ingot",
		"Magnesium Ingot",
		"Aluminium Ingot",
		"Zinc Ingot",
		"Lead Ingot",
		"Magnetite Ingot",
		"Titanium Ingot",
		"Chromium Ingot",
		"Cobalt Ingot",
		"Nickel Ingot",
		"Platinum Ingot",
		"Mercury Ingot",
		"Lithium Ingot",
		"Plutonium Ingot",
		"Arsenic Ingot"
	};
	
	public barItems(int i) {
		super(i);
	    setCreativeTab(CreativeTabs.tabMaterials);
		setMaxDamage(0);
		setHasSubtypes(true);
	}
	
    public int getIconFromDamage(int par1)
    {
        return this.iconIndex = par1+16;
    }
    
    public String getItemNameIS(ItemStack par1ItemStack)
    {
        int var2 = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getItemDisplayName(par1ItemStack) + "." + blockNames[var2];
    }
 }
