package net.axelandre42.mct.common;

import net.axelandre42.mct.CreativeTab;
import net.axelandre42.mct.Settings;
import net.axelandre42.mct.common.init.Items;
import net.axelandre42.mct.common.item.CPUItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		Settings.INSTANCE = new Settings(new Configuration(e.getSuggestedConfigurationFile()));
		CreativeTab.INSTANCE = new CreativeTab();
		Items.construct();
	}
	
	public void init(FMLInitializationEvent e) {
		
		Items.register();
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
