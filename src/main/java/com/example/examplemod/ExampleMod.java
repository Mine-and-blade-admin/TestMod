package com.example.examplemod;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final int testID = 22000;
    
    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        GameRegistry.registerItem(new TestItem(testID), "test:example");
    }
}
