package net.axelandre42.mct;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.axelandre42.mct.common.CommonProxy;

@Mod(modid = MoreCompuThings.MODID, version = MoreCompuThings.VERSION, dependencies = MoreCompuThings.DEPENDENCIES)
public class MoreCompuThings {
	public static final String MODID = "MoreCompuThings";
	public static final String VERSION = "A0.01";
	public static final String DEPENDENCIES =
			"require-after:OpenComputers";
	
	@Instance(value = MODID)
	public static MoreCompuThings INSTANCE;
	
	@SidedProxy(clientSide = "net.axelandre42.mct.client.ClientProxy", 
			serverSide = "net.axelandre42.mct.server.ServerProxy")
	public static CommonProxy PROXY;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		PROXY.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		PROXY.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		PROXY.postInit(e);
	}
}
