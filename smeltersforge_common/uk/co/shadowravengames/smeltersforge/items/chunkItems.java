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

public class chunkItems extends Item {
	
	public static String[] chunkNames = {
		"Sodium Chunk",
		"Calcium Chunk",
		"Magnesium Chunk",
		"Aluminium Chunk",
		"Zinc Chunk",
		"Lead Chunk",
		"Magnetite Chunk",
		"Titanium Chunk",
		"Chromium Chunk",
		"Cobalt Chunk",
		"Nickel Chunk",
		"Platinum Chunk",
		"Mercury Chunk",
		"Lithium Chunk",
		"Plutonium Chunk",
		"Arsenic Chunk"
	};
	
	public chunkItems(int i) {
		super(i);
		setHasSubtypes(true);
        setCreativeTab(SmeltersForge.smeltersForgeTab);
    }
	
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
	
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        icons = new Icon[16];
        for( int i = 0; i < icons.length; i++ ) {
        	icons[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + "chunk_" + i);
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
        return getUnlocalizedName() + "." + chunkNames[itemstack.getItemDamage()];
    }
    
    @Override
    public String getItemDisplayName(ItemStack itemStack) {
    	return super.getItemDisplayName(itemStack);
    }
}
