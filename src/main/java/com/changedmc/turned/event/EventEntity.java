package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventEntity {

    private static void syncCapability(Entity entity) {
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(ITransfurCapability::syncCapability);
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerChangeDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        syncCapability(event.getEntity());
    }

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event) {
        event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent((transfurCapability) -> transfurCapability.setLatexLevel(0));
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayer(RenderPlayerEvent.Pre event) {
        AbstractClientPlayer player = Minecraft.getInstance().player;
        if (player == null) return;
        ITransfurCapability transfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability != null && transfurCapability.isTransfured()) {
            Main.TRANSFUR_MANAGER.render(event, transfurCapability.getTransfurType());
        }
    }
}