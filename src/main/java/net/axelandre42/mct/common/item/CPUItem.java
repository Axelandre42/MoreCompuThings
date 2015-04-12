package net.axelandre42.mct.common.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.axelandre42.mct.MoreCompuThings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class CPUItem extends Item {
	
	public CPUItem() {
		super();
		
		this.setUnlocalizedName("cpu");
		this.setCreativeTab(null);
		this.setHasSubtypes(true);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons = new IIcon[1];
	
	private String[] names = new String[]{
		"asembler"
	};
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister reg) {
		for (int i = 0; i < names.length; i++)
			icons[i] = reg.registerIcon(MoreCompuThings.MODID + ":" + getUnlocalizedName().substring(5) + names[i]);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName() + "." + names[stack.getItemDamage()];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int damage) {
		return icons[damage];
	}
	
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 1; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
}
