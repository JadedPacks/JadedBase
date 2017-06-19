package com.jadedpacks.jadedbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jadedpacks.jadedbase.helpers.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;

@Mod(modid = "jcbase", version = "@VERSION@", name = "JadedBase", dependencies = "required-after:Forge@[10.13.3.1384,11.14);")
public class Main {
	public static Logger log = LogManager.getLogger("JadedBase");

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ItemStackHolderInjector.INSTANCE.inject();
		Wood.init();
	}
}