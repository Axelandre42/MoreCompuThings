package net.axelandre42.mct.common.block;

import net.axelandre42.mct.CreativeTab;
import net.axelandre42.mct.MoreCompuThings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLocomotiveRelay extends Block {

	public BlockLocomotiveRelay() {
		super(Material.rock);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(CreativeTab.INSTANCE);
		this.setHardness(0.5F);
		this.setBlockName("locomotive_relay");
		this.setBlockTextureName(MoreCompuThings.MODID + ":locomotive_relay");
		
	}
	
	

}
