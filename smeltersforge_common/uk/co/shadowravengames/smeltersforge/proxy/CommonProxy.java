package uk.co.shadowravengames.smeltersforge.proxy;

import uk.co.shadowravengames.smeltersforge.entities.OreTileEntity;
import uk.co.shadowravengames.smeltersforge.renderers.TileRendererOre;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy implements IGuiHandler {

	public void registerKeyBindingHandler() {}

    public void initRenderingAndTextures() {}
    
    public void registerSoundHandler() {}
    
    public void initCustomRarityTypes() {}

    public EnumRarity getCustomRarityType(String customRarity) {
        return null;
    }
    
    public void initTileEntities() {}
    
    public void addStringLocalization(String key, String lang, String value) {
        LanguageRegistry.instance().addStringLocalization(key, lang, value);
    }
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {        
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    	return null;
    }
    
	public void initCapes() {}
	
	public void registerTileEntity(Class clz, String id) {
		GameRegistry.registerTileEntity(clz, id);
	}


}