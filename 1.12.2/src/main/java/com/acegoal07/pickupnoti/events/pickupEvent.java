package com.acegoal07.pickupnoti.events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class pickupEvent {

    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event)
    {
        String player = event.getEntityPlayer().getName();
        String item = event.getItem().getItem().getDisplayName().toLowerCase();
        int amount = event.getItem().getItem().getCount();
        event.getEntityPlayer().sendMessage(new TextComponentString(player+" has picked up "+item+" x"+amount));
    }
}