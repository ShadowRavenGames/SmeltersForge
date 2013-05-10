package uk.co.shadowravengames.smeltersforge.renderers;

import org.lwjgl.opengl.GL11;

import uk.co.shadowravengames.smeltersforge.entities.OreTileEntity;
import uk.co.shadowravengames.smeltersforge.models.OreModel;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileRendererOre extends TileEntitySpecialRenderer {
	
	public TileRendererOre() {
		aModel = new OreModel();
	}

    public void setTileEntityRenderer(TileEntityRenderer par1TileEntityRenderer) {
        super.setTileEntityRenderer(par1TileEntityRenderer);
    }
	
    public void renderOre(OreTileEntity ore, double d, double d1, double d2, float f) {
    	GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.999F, (float)d1 + 0.999F, (float)d2 + 0.001F);
        GL11.glScalef(0.998F, 0.998F, 0.998F);
        GL11.glRotatef(180F, 0F, 0F, 1F);
        GL11.glPushMatrix();

        GL11.glDepthMask(false);
        GL11.glDisable(2896);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        bindTextureByName("/mods/smeltersForge/textures/blocks/ore_inner.png");
        aModel.renderModel(0.0625F);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
        
        GL11.glPopMatrix();
        GL11.glPopMatrix();
	}
    
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float f) {
		this.renderOre((OreTileEntity)tileentity, d0, d1, d2, f);
	}
	
	private OreModel aModel;
	
}
