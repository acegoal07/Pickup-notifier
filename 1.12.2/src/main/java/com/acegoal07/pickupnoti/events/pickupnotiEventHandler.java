package com.acegoal07.pickupnoti.events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class pickupnotiEventHandler {

    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event)
    {

        String user = event.getEntityPlayer().getName();

        String item = event.getItem().getItem().getDisplayName().toLowerCase();

        int amount = event.getItem().getItem().getCount();

        event.getEntityPlayer().sendMessage(new TextComponentString(user+" has picked up "+item+" x"+amount));
    }
}