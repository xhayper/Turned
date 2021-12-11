package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.TurnedCapability;
import com.changedmc.turned.config.TurnedCommonConfig;
import com.changedmc.turned.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventEntity {

    // TODO: Remove this event when we manage to get transfur capability to work properly
    @SubscribeEvent
    public static void onEntityItemPickup(EntityItemPickupEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        event.getEntity().getCapability(TurnedCapability.TRANSFUR).ifPresent(capability -> { capability.setTransfurType(1);capability.setTransfured(true); });
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD)
            event.getEntity().getCapability(TurnedCapability.TRANSFUR).ifPresent(capability -> Main.LOGGER.debug(event.getEntity() + "'s isTransfured: " + capability.isTransfured()));
    }

    // TODO: Find better way to handle rendering
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayer(RenderPlayerEvent event) {
        AbstractClientPlayer player = Minecraft.getInstance().player;
        if (player == null) return;
        player.getCapability(TurnedCapability.TRANSFUR).ifPresent(capability -> {
            if (!capability.isTransfured()) return;
            event.setCanceled(true);
            switch(capability.getTransfurType()) {
                case 1:
                    // Placeholder #1
                    break;
                case 2:
                    // Placeholder #2
                    break;
            }
        });
    }
}