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
import net.minecraft.util.MathHelper;

public class largeChunkItems extends Item {
	
	public static String[] largeChunkNames = {
		"Large Sodium Chunk",
		"Large Calcium Chunk",
		"Large Magnesium Chunk",
		"Large Aluminium Chunk",
		"Large Zinc Chunk",
		"Large Lead Chunk",
		"Large Magnetite Chunk",
		"Large Titanium Chunk",
		"Large Chromium Chunk",
		"Large Cobalt Chunk",
		"Large Nickel Chunk",
		"Large Platinum Chunk",
		"Large Mercury Chunk",
		"Large Lithium Chunk",
		"Large Plutonium Chunk",
		"Large Arsenic Chunk",
	};
	
	public largeChunkItems(int i) {
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
        	icons[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + "largechunk_" + i);
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
        return getUnlocalizedName() + "." + largeChunkNames[itemstack.getItemDamage()];
    }
    
    @Override
    public String getItemDisplayName(ItemStack itemStack) {
    	return super.getItemDisplayName(itemStack);
    }
}
