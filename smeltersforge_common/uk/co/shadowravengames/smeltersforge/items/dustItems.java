package uk.co.shadowravengames.smeltersforge.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import uk.co.shadowravengames.smeltersforge.SmeltersForge;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

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
        setCreativeTab(SmeltersForge.smeltersForgeTab);
		setHasSubtypes(true);
	}

	@SideOnly(Side.CLIENT)
    private Icon[] icons;
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        icons = new Icon[16];
        for( int i = 0; i < icons.length; i++ ) {
        	icons[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + "dust_" + i);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1) {
    	return icons[par1];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2createTabs, List par3list) {
    	for(int i = 0; i < icons.length; i++ ) {
    		par3list.add(new ItemStack(par1, 1, i));
    	}
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return getUnlocalizedName() + "." + dustNames[itemstack.getItemDamage()];
    }
    
    @Override
    public String getItemDisplayName(ItemStack itemStack) {
    	return super.getItemDisplayName(itemStack);
    }
}
