package com.kashdeya.enderenhancement.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.enderenhancement.blocks.EmpoweredEnderBlock;
import com.kashdeya.enderenhancement.blocks.EnderBlock;
import com.kashdeya.enderenhancement.blocks.ExtremeEnderBlock;
import com.kashdeya.enderenhancement.ref.Reference;

public class Blocks {
	
	public static Block eeEmpoweredEnderBlock;
	public static Block eeExtremeEnderBlock;
	public static Block eeEnderBlock;
	
	public static void init(){
		// Blocks
		eeEnderBlock = new EnderBlock(Material.ANVIL);
	    registerBlock(eeEnderBlock, "eeEnderBlock", true);
	    eeEmpoweredEnderBlock = new EmpoweredEnderBlock(Material.ANVIL);
	    registerBlock(eeEmpoweredEnderBlock, "eeEmpoweredEnderBlock", true);
	    eeExtremeEnderBlock = new ExtremeEnderBlock(Material.ANVIL);
	    registerBlock(eeExtremeEnderBlock, "eeExtremeEnderBlock", true);
	}
	
	public static void registerBlock(Block block, String name, boolean itemblock){
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID + ":" + name));
		if (itemblock){
			GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MOD_ID + ":" + name));
		}
	}

}
