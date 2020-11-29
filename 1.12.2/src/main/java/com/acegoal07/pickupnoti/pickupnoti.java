package com.acegoal07.pickupnoti;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = pickupnoti.MODID, name = pickupnoti.NAME, version = pickupnoti.VERSION)
public class pickupnoti
{
    public static final String MODID = "pickupnoti";
    public static final String NAME = "Pickup notifier";
    public static final String VERSION = "1.0.1";

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new pickupnotiEventHandler());
    }
}