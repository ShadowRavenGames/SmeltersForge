package uk.co.shadowravengames.smeltersforge.blocks;

import java.util.Random;

import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class OreBlocks extends Blocks {
	
	public OreBlocks(int i) {
		super(i, Material.rock);
	    registerIcons(Reference.ORE_SPRITE_SHEET);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(3.0F);
	}
	
	public int idDropped(int metadata, Random random) {
		return blockID;
	}
	
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
    	return false;
    }
	
	public int damageDropped(int metadata) {
		return metadata;
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		return metadata;
	}

}
