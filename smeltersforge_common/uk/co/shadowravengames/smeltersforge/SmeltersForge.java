package uk.co.shadowravengames.smeltersforge;

import uk.co.shadowravengames.smeltersforge.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;

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

}
