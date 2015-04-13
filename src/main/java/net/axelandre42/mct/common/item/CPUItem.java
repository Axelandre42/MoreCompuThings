package net.axelandre42.mct.common.item;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.axelandre42.mct.CreativeTab;
import net.axelandre42.mct.MoreCompuThings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.Language;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class CPUItem extends Item {
	
	public CPUItem() {
		super();
		
		this.setUnlocalizedName("advanced_cpu");
		this.setCreativeTab(CreativeTab.INSTANCE);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons = new IIcon[1];
	
	private String[] names = new String[]{
		"default"
	};
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister reg) {
		for (int i = 0; i < names.length; i++)
			icons[i] = reg.registerIcon(MoreCompuThings.MODID + ":" + getUnlocalizedName().substring(5) + "_" + names[i]);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return getUnlocalizedName() + "." + names[0];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconIndex(ItemStack stack) {
		return icons[0];
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isSneaking) {
		
	}
}
