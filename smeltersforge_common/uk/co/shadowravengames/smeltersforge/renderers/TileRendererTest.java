package uk.co.shadowravengames.smeltersforge.renderers;

import org.lwjgl.opengl.GL11;

import uk.co.shadowravengames.smeltersforge.entities.TestTileEntity;
import uk.co.shadowravengames.smeltersforge.models.TestModel;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileRendererTest extends TileEntitySpecialRenderer {
	
	public TileRendererTest() {
		aModel = new TestModel();
	}

    public void setTileEntityRenderer(TileEntityRenderer par1TileEntityRenderer) {
        super.setTileEntityRenderer(par1TileEntityRenderer);
    }
	
    public void renderTest(TestTileEntity ore, double d, double d1, double d2, float f) {
    	GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
        GL11.glRotatef(180F, 0F, 0F, 1F);
        bindTextureByName("/mods/smeltersForge/textures/models/test.png");
        GL11.glPushMatrix();
        aModel.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
	}
    
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float f) {
		this.renderTest((TestTileEntity)tileentity, d0, d1, d2, f);
	}
	
	private TestModel aModel;
	
}
