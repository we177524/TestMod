package com.ikill.intro.block;

import com.ikill.intro.IntroMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GemBlock extends Block {
	
	
	public GemBlock(String unlocalizedName, String registryName) {
		this(Material.IRON, SoundType.METAL, unlocalizedName, registryName);
	}
	
	public GemBlock (Material material, String unlocalizedName, String registryName) {
		this(material, SoundType.STONE, unlocalizedName, registryName);
		
	}
	
	public GemBlock(Material material, SoundType sound, String unlocalizedName, String registryName) {
		super(material);
		setUnlocalizedName(IntroMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setSoundType(sound);
	}

}
