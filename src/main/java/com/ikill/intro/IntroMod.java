package com.ikill.intro;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = IntroMod.MODID, name = IntroMod.NAME, version = IntroMod.VERSION, acceptedMinecraftVersions = IntroMod.MC_VERSION)
public class IntroMod {
	
	public static final String MODID = "intromod";
    public static final String NAME = "Intro Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
	
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	logger.info(IntroMod.NAME + "says hi!");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }

}
