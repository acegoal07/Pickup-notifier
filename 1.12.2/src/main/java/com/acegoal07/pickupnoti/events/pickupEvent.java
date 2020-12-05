package com.acegoal07.pickupnoti.events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pickupEvent {

    @SubscribeEvent
    public void pickupItem(EntityItemPickupEvent event)
    {
        String player = event.getEntityPlayer().getName();
        String item = event.getItem().getItem().getDisplayName().toLowerCase();
        int amount = event.getItem().getItem().getCount();
        Date time = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); /*to display date(yyyy/mm/dd)*/
        String formattedTime = dateFormat.format(time);
        event.getEntityPlayer().sendMessage(new TextComponentString("["+formattedTime+"]: "+player+" has picked up "+item+" x"+amount));
    }
}