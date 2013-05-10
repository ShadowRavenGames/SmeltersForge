package uk.co.shadowravengames.smeltersforge.proxy;

import uk.co.shadowravengames.smeltersforge.entities.OreTileEntity;
import uk.co.shadowravengames.smeltersforge.entities.TestTileEntity;
import uk.co.shadowravengames.smeltersforge.lib.DeveloperCapesAPI;
import uk.co.shadowravengames.smeltersforge.renderers.TileRendererOre;
import uk.co.shadowravengames.smeltersforge.renderers.TileRendererTest;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;

public class ClientProxy extends CommonProxy {

	public ClientProxy() {
	}
	
    public void initTileEntities() {
    	ClientRegistry.bindTileEntitySpecialRenderer(OreTileEntity.class, new TileRendererOre());
    	ClientRegistry.bindTileEntitySpecialRenderer(TestTileEntity.class, new TileRendererTest());
    }

	
	@Override
	public void initCapes() {
		DeveloperCapesAPI.getInstance().init("http://admin.shadowravengames.co.uk/capes/capes.txt");
	}
	
	@Override
	public void registerTileEntity(Class clz, String id) {
		super.registerTileEntity(clz, id);
	}
	
	public void registerKeyBindingHandler() {
	}
		
}
