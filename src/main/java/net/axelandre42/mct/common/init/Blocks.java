package net.axelandre42.mct.common.init;

import net.axelandre42.mct.MoreCompuThings;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	
	public static void construct() {
	}
	
	private static void simpleRegister(Block block) {
		GameRegistry.registerBlock(block, MoreCompuThings.MODID + ":" + block.getUnlocalizedName().substring(5));
	}
	
	public static void register() {
		
	}
}
