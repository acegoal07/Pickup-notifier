package com.acegoal07.pickupnoti;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class pickupnotiEventHandler {
    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event) {
        event.getEntityPlayer().sendMessage(new TextComponentString(event.getEntityPlayer().getName()+" has picked up "+event.getItem().getDisplayName().getFormattedText()));
    }
}