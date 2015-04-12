package net.axelandre42.mct;

import net.axelandre42.mct.common.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {
	
	public static CreativeTab INSTANCE;

	public CreativeTab() {
		super("tabMoreCompuThings");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Items.itemCPU;
	}

}
