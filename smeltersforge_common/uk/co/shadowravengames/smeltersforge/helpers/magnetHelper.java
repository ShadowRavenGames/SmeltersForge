package uk.co.shadowravengames.smeltersforge.helpers;

import java.util.Random;

import uk.co.shadowravengames.smeltersforge.items.Items;
import uk.co.shadowravengames.smeltersforge.lib.BlockIds;
import uk.co.shadowravengames.smeltersforge.lib.ItemIds;
import uk.co.shadowravengames.smeltersforge.models.TestModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;


public class magnetHelper extends Block {

	public magnetHelper(int par1, int par2, Material par3Material) {
		super(par1, par3Material);
	}

	public static boolean magnetAction(World world, EntityPlayer player, ItemStack stack, int x, int y, int z) {
		int id = world.getBlockId(x, y, z);
		int meta = world.getBlockMetadata(x, y, z);

        if ( !world.isRemote ) {
	    	if( player.inventory.getCurrentItem().itemID == (ItemIds.MAGNET_DEFAULT+256) ) {
        		Random rn = new Random();
       			int r = rn.nextInt(4)+4;
       			int cr = 16-r;
        		if( id == BlockIds.BLOCKS_DEFAULT ) {
        			ItemStack item = new ItemStack(Items.Chunks, r, meta);
        			ItemStack item2 = new ItemStack(Items.CobbleChunk, cr, 0);

       	            float var6 = 0.7F;
       	            double var7 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       	            double var9 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       	            double var11 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       				if( world.spawnEntityInWorld(new EntityItem(world, (double)x +var7, (double)y +var9, (double)z +var11, item)) ) {
           				if( world.spawnEntityInWorld(new EntityItem(world, (double)x +var7, (double)y +var9, (double)z +var11, item2)) ) {
           					world.setBlock(x, y, z, 0);
           					world.playSoundAtEntity(player, "random.fizz", 0.4F, 2.0F + world.rand.nextFloat() * 0.4F);
           					damageItem(player.getCurrentEquippedItem());
           				}
       				}
   	        		   	        		
        			return true;
	        	}else if( id == Block.oreDiamond.blockID || id == Block.oreIron.blockID || id == Block.oreGold.blockID || id == Block.oreEmerald.blockID) {
	        		int m = 0;
	        		if(id == Block.oreDiamond.blockID) {
	        			m=0;
	        		}else if(id == Block.oreIron.blockID) {
	        			m=1;
	        		}else if(id == Block.oreGold.blockID) {
	        			m=2;
	        		}else if(id == Block.oreEmerald.blockID) {
	        			m=3;
	        		}
	        		
	        		ItemStack item = new ItemStack(Items.VANILLA_Chunks, r, m);
        			ItemStack item2 = new ItemStack(Items.CobbleChunk, cr, 0);

       	            float var6 = 0.7F;
       	            double var7 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       	            double var9 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       	            double var11 = (double)(world.rand.nextFloat() * var6) + (double)(1.0F - var6) * 0.5D;
       				if( world.spawnEntityInWorld(new EntityItem(world, (double)x +var7, (double)y +var9, (double)z +var11, item)) ) {
           				if( world.spawnEntityInWorld(new EntityItem(world, (double)x +var7, (double)y +var9, (double)z +var11, item2)) ) {
           					world.setBlock(x, y, z, 0);
           					world.playSoundAtEntity(player, "random.fizz", 0.4F, 2.0F + world.rand.nextFloat() * 0.4F);
           					damageItem(player.getCurrentEquippedItem());
           				}
       				}
   	        		   	        		
        			return true;
	        	}
        	}else{
        		return false;
        	}
        }
		return false;
	}
	
    public static void damageItem(ItemStack is) {
    	EntityPlayer player = ModLoader.getMinecraftInstance().thePlayer;
    	is.damageItem(1, player);
    }

}
