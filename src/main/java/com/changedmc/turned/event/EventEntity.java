package com.changedmc.turned.event;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.client.render.player.PlayerDarkLatexFoxRenderer;
import com.changedmc.turned.client.render.player.PlayerDarkLatexSnowLeopardRenderer;
import com.changedmc.turned.util.Utility;
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

    private static void sc(Entity entity) {
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(ITransfurCapability::syncCapability);
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        sc(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        sc(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerChangeDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        sc(event.getEntity());
    }

    @SubscribeEvent
    public static void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        sc(event.getEntity());
    }

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event) {
        event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent((transfurCapability) -> {
            transfurCapability.setLatexLevel(0);
        });
    }

    // TODO: Find better way to handle rendering
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayer(RenderPlayerEvent event) {
        AbstractClientPlayer player = Minecraft.getInstance().player;
        if (player == null) return;
        ITransfurCapability transfurCapability = player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability != null && transfurCapability.isTransfured()) {
            event.setCanceled(true);
            switch (transfurCapability.getTransfurType()) {
                case 1 -> {
                    PlayerDarkLatexFoxRenderer playerDarkLatexFoxRenderer = new PlayerDarkLatexFoxRenderer(Utility.getEntityRendererContext());
                    playerDarkLatexFoxRenderer.render(player, 1, event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
                }
                // Placeholder #1
                case 2 -> {
                    PlayerDarkLatexSnowLeopardRenderer playerDarkLatexSnowLeopardRenderer = new PlayerDarkLatexSnowLeopardRenderer(Utility.getEntityRendererContext());
                    playerDarkLatexSnowLeopardRenderer.render(player, 1, event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight());
                }
                // Placeholder #2
            }
        }
    }
}