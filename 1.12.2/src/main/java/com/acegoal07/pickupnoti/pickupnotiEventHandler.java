package com.acegoal07.pickupnoti;

import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class pickupnotiEventHandler {
    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
        System.out.println(event.getEntityPlayer() + "has picked up" + event.getItem());
    }
}
