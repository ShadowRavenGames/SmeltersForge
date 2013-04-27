package uk.co.shadowravengames.smeltersforge.proxy;

import uk.co.shadowravengames.smeltersforge.lib.DeveloperCapesAPI;
import cpw.mods.fml.client.registry.KeyBindingRegistry;

public class ClientProxy extends CommonProxy {

	public ClientProxy() {
	}
	
	@Override
	public void initCapes() {
		DeveloperCapesAPI.getInstance().init("http://admin.shadowravengames.co.uk/capes/capes.txt");
	}
	
	public void registerKeyBindingHandler() {
	}
		
}
