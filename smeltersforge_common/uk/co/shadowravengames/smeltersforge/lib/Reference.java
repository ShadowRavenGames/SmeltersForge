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
    public static final String CREATIVE_TAB_NAME = "vCraft Mod Items";
    
    public static final String SERVER_PROXY_CLASS = "uk.co.shadowravengames.smeltersforge.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "uk.co.shadowravengames.smeltersforge.proxy.ClientProxy";

    /* Texture related constants */
    public static final String SPRITE_SHEET_LOCATION = "/smeltersForge/resources/textures/sprites/";
    public static final String ARMOR_SHEET_LOCATION = "/smeltersForge/resources/textures/armor/";
    public static final String GUI_SHEET_LOCATION = "/smeltersForge/resources/textures/gui/";
    public static final String ITEM_SPRITE_SHEET = "/smeltersForge/resources/textures/items.png";
    public static final String BLOCK_SPRITE_SHEET = "/smeltersForge/resources/textures/blocks.png";
    public static final String ORE_SPRITE_SHEET = "/smeltersForge/resources/textures/ores.png";
    public static final String CHEST_SHEET = "/smeltersForge/resources/textures/vStorage.png";
	
}
