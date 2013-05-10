package uk.co.shadowravengames.smeltersforge.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OreModel extends ModelBase {
  //fields
  public static ModelRenderer Shape1;
 
  public OreModel() {
        textureWidth = 16;
        textureHeight = 16;
   
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 16, 16, 16);
        Shape1.setTextureSize(16, 16);
  }
 
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Shape1.render(f5);
  }
 
  public void renderModel (float f1) {
	  Shape1.render(f1);
  }
 
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }
}