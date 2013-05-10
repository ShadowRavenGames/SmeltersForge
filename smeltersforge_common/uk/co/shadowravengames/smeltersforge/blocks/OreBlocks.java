package uk.co.shadowravengames.smeltersforge.blocks;

import java.util.List;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import uk.co.shadowravengames.smeltersforge.SmeltersForge;
import uk.co.shadowravengames.smeltersforge.entities.OreTileEntity;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class OreBlocks extends BlockContainer {
	
	Class<?> entity;

	public OreBlocks(int i, Class<?> tClass) {
		super(i, Material.rock);
		entity = tClass;
		setCreativeTab(SmeltersForge.smeltersForgeTab);
		this.setResistance(5.0F);
		this.setHardness(3.0F);
	}

	public int damageDropped(int meta) {
		return meta;
	}
	
	public void fillWithRain(World par1World, int par2, int par3, int par4) {
		if (par1World.rand.nextInt(20) == 1) {
            int l = par1World.getBlockMetadata(par2, par3, par4);
            if (l < 3) {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, l + 1, 2);
            }
        }
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[16];
		for( int i = 0; i < icons.length; i++ ) {
			icons[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + "ore_" + i);
		}
	}
	
	public int getRenderType() {
		  return 0;
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return icons[par2];
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2createTabs, List par3list) {
		for(int i = 0; i < icons.length; i++ ) {
			par3list.add(new ItemStack(par1, 1, i));
		}
	}

	public boolean renderAsNormalBlock() {
		return true;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public TileEntity getBlockEntity() {
		try {
			return (TileEntity)entity.newInstance();
		} catch (Exception e) {
            throw new RuntimeException(e);
		}
	}
	
	public TileEntity createNewTileEntity(World world) {
	  return new OreTileEntity();
	}

}
