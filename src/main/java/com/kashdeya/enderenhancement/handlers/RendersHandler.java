package com.kashdeya.enderenhancement.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.kashdeya.enderenhancement.ref.Reference;
import com.kashdeya.enderenhancement.init.Blocks;
import com.kashdeya.enderenhancement.init.Items;

public class RendersHandler {
	
	public static void Blocks(){
		InventoryBlockRender(Blocks.eeEnderBlock, "eeEnderBlock");
		InventoryBlockRender(Blocks.eeEmpoweredEnderBlock, "eeEmpoweredEnderBlock");
		InventoryBlockRender(Blocks.eeExtremeEnderBlock, "eeExtremeEnderBlock");
	}
	
	public static void Items(){
		InventoryItemRender(Items.eeStick, "eeStick");
		InventoryItemRender(Items.eeNugget, "eeNugget");
		InventoryItemRender(Items.eeFruit, "eeFruit");
		InventoryItemRender(Items.eeExtremeEnderPearl, "eeExtremeEnderPearl");
		InventoryItemRender(Items.eeEmpoweredEnderPearl, "eeEmpoweredEnderPearl");
	}
	
	  public static void InventoryBlockRender(Block block, String blockName)
	  {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
	  }
	  
	  public static void InventoryItemRender(Item item, String itemName)
	  {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	  }

}
