package com.kashdeya.enderenhancement.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Fruit extends ItemFood {
	
	public Fruit(int amount, float saturation,
			boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	
	@Override
    protected void onFoodEaten(ItemStack stack, World World, EntityPlayer Player)
    {
        if (!World.isRemote)
        {
            Player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 0, true, false));
            Player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 0, true, false));
            Player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 600, 0, true, false));
            Player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 3600, 0, true, false));
            Player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 600, 0, true, false));
            Player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 600, 0, true, false));
            
        }
    }

}
