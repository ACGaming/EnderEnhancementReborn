package com.kashdeya.enderenhancement.init;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.enderenhancement.items.EmpoweredEnderPearl;
import com.kashdeya.enderenhancement.items.ExtremeEnderPearl;
import com.kashdeya.enderenhancement.items.Fruit;
import com.kashdeya.enderenhancement.items.Nugget;
import com.kashdeya.enderenhancement.items.Stick;
import com.kashdeya.enderenhancement.ref.Reference;

public class Items {
	
	public static Item eeStick;
	public static Item eeNugget;
	public static Item eeFruit;
	public static Item eeEmpoweredEnderPearl;
	public static Item eeExtremeEnderPearl;
	
	
	public static void init(){
		// Items
		eeStick = new Stick().setUnlocalizedName("eeStick");
	    registerItem(eeStick, "eeStick");
	    eeNugget = new Nugget().setUnlocalizedName("eeNugget");
	    registerItem(eeNugget, "eeNugget");
	    eeFruit = new Fruit(20, 1.0F, false).setUnlocalizedName("eeFruit");
	    registerItem(eeFruit, "pearl_dust");
	    eeEmpoweredEnderPearl = new EmpoweredEnderPearl().setUnlocalizedName("eeEmpoweredEnderPearl");
	    registerItem(eeEmpoweredEnderPearl, "eeEmpoweredEnderPearl");
	    eeExtremeEnderPearl = new ExtremeEnderPearl().setUnlocalizedName("ExtremeEnderPearl");
	    registerItem(eeExtremeEnderPearl, "ExtremeEnderPearl");
	    
	}
	
	static void registerItem(Item item, String name){
	    GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}

}
