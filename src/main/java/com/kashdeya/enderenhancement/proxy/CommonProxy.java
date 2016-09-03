package com.kashdeya.enderenhancement.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.enderenhancement.init.Blocks;
import com.kashdeya.enderenhancement.init.Items;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
    	// Load init
		Items.init();
		Blocks.init();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

}
