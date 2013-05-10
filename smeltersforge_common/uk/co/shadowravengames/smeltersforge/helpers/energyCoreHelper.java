package uk.co.shadowravengames.smeltersforge.helpers;

import uk.co.shadowravengames.smeltersforge.lib.BlockIds;
import uk.co.shadowravengames.smeltersforge.lib.ItemIds;
import uk.co.shadowravengames.smeltersforge.models.TestModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;


public class energyCoreHelper extends Block {
	
	public energyCoreHelper(int par1, int par2, Material par3Material) {
		super(par1, par3Material);
	}

	public static boolean magnetAction(World world, EntityPlayer player, ItemStack stack, int x, int y, int z) {
		int id = world.getBlockId(x, y, z);

        if ( !world.isRemote ) {
	    	if( player.inventory.getCurrentItem().itemID == (ItemIds.ENERGY_CORE_DEFAULT+256) ) {
        		if( id == BlockIds.TEST_DEFAULT ) {
        			if( TestModel.energyCoreShown == 0 ) {
        				TestModel.energyCore.showModel = true;
   						damageItem(player.getCurrentEquippedItem());
   						TestModel.energyCoreShown = 1;
        			}
	        	}
        	}else{
        		return false;
        	}
        }
		return false;
	}
	
    public static void damageItem(ItemStack is) {
    	EntityPlayer player = ModLoader.getMinecraftInstance().thePlayer;
    	is.damageItem(2, player);
    }

}
