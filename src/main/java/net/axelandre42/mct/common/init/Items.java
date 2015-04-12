package net.axelandre42.mct.common.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.axelandre42.mct.MoreCompuThings;
import net.axelandre42.mct.common.item.CPUItem;
import net.minecraft.item.Item;

public class Items {
	public static Item itemCPU;
	
	public static void construct() {
		itemCPU = new CPUItem();
	}
	
	private static void simpleRegister(Item item) {
		GameRegistry.registerItem(item, MoreCompuThings.MODID + ":" + item.getUnlocalizedName().substring(5));
	}
	
	public static void register() {
		simpleRegister(itemCPU);
	}
}
