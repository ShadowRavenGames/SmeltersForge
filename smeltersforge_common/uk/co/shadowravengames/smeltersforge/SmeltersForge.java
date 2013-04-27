package uk.co.shadowravengames.smeltersforge;

import net.minecraft.creativetab.CreativeTabs;
import uk.co.shadowravengames.smeltersforge.blocks.Blocks;
import uk.co.shadowravengames.smeltersforge.items.Items;
import uk.co.shadowravengames.smeltersforge.lib.Recipes;
import uk.co.shadowravengames.smeltersforge.lib.Reference;
import uk.co.shadowravengames.smeltersforge.lib.Smelting;
import uk.co.shadowravengames.smeltersforge.proxy.CommonProxy;
import uk.co.shadowravengames.smeltersforge.worldgen.Worldgen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(
	modid   = Reference.MOD_ID,
	name    = Reference.MOD_NAME,
	version = Reference.VERSION
)

@NetworkMod(
	channels = {
		Reference.CHANNEL_NAME
	},
	clientSideRequired = true,
	serverSideRequired = false
)

public class SmeltersForge {

   	@Instance(Reference.MOD_ID)
    public static SmeltersForge instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

   	public static CreativeTabs smeltersForgeTab = new CreativeTabSmeltersForge(CreativeTabs.getNextID(), Reference.CREATIVE_TAB_NAME);
	
	@PreInit
	public void preInit( FMLPreInitializationEvent event ) {		
		proxy.registerKeyBindingHandler();
        proxy.registerSoundHandler();
	}

	@Init
	public void load( FMLInitializationEvent event ) {
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		
		Blocks.init();
		Items.init();
		Recipes.init();
		Smelting.init();		
		
		proxy.initTileEntities();
		
		GameRegistry.registerWorldGenerator(new Worldgen());
	}
   	
}
