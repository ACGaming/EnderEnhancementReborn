package com.kashdeya.enderenhancement.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EnderEnhancementTab extends CreativeTabs {

	public EnderEnhancementTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.ENDER_PEARL;
	}

}
