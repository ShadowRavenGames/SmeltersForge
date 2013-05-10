package uk.co.shadowravengames.smeltersforge.lib;

import net.minecraft.creativetab.CreativeTabs;
import uk.co.shadowravengames.smeltersforge.SmeltersForge;

public class Reference {

    public static final String MOD_ID = "smeltersforge";
    public static final String MOD_NAME = "Smelters Forge";
    public static final String VERSION = "1.0b";
       
    public static final String CHANNEL_NAME = MOD_ID;
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
    
    public static final CreativeTabs CREATIVE_TAB_ID = SmeltersForge.smeltersForgeTab;
    public static final String CREATIVE_TAB_NAME = "Smelters Forge";
    
    public static final String SERVER_PROXY_CLASS = "uk.co.shadowravengames.smeltersforge.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "uk.co.shadowravengames.smeltersforge.proxy.ClientProxy";

    /* Texture related constants */
    public static final String TEXTURE_PATH = MOD_ID + ":";
	
}
