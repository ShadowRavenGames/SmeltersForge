package uk.co.shadowravengames.smeltersforge.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import uk.co.shadowravengames.smeltersforge.SmeltersForge;
import uk.co.shadowravengames.smeltersforge.entities.TestTileEntity;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TestBlock extends BlockContainer {
	
	Class<?> entity;

	public TestBlock(int i, Class<?> tClass) {
		super(i, Material.rock);
		entity = tClass;
		setCreativeTab(SmeltersForge.smeltersForgeTab);
		this.setResistance(5.0F);
		this.setHardness(3.0F);
	}

	public int damageDropped(int meta) {
		return meta;
	}

	@SideOnly(Side.CLIENT)
	private Icon icon;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "test");
	}
	
    public int getRenderBlockPass() {
        return 1;
    }
	
	public int getRenderType() {
		  return 0;
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return icon;
	}

	public boolean renderAsNormalBlock() {
		return false;
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
	  return new TestTileEntity();
	}


}
