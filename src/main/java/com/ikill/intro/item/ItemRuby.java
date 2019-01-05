package com.ikill.intro.item;

import com.ikill.intro.IntroMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRuby extends Item{

	
	public ItemRuby(String unlocalizedName, String registryName) {
        setUnlocalizedName(IntroMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
    }
}
