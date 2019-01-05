package com.ikill.intro.util;

import com.ikill.intro.block.GemBlock;
import com.ikill.intro.init.ModBlocks;
import com.ikill.intro.item.ItemRuby;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new GemBlock(Material.IRON, SoundType.METAL, "ruby_block", "ruby_block"),

		};

	}

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = { new ItemRuby("ruby", "ruby") };

		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.RUBY_BLOCK.setRegistryName(ModBlocks.RUBY_BLOCK.getRegistryName())) };

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}

}