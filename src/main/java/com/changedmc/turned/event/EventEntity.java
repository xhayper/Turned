package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.client.model.player.PlayerDarkLatexFoxModel;
import com.changedmc.turned.client.render.player.PlayerDarkLatexFoxRenderer;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import com.changedmc.turned.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.PacketDistributor;

public class EventEntity {
    // TODO: Not sure if we need to only sync the player or we need to sync all entity, maybe make it work with entity later?
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof PlayerEntity)) return;
        if (event.getWorld().isClientSide) return;
        World world = event.getWorld();
        Entity entity = event.getEntity();
        MinecraftServer server = world.getServer();
        if (server == null) return;
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> {
            for (ServerPlayerEntity serverPlayerEntity : server.getPlayerList().getPlayers()) {
                if (serverPlayerEntity.level.dimension().location() == entity.level.dimension().location()) {
                    NetworkManager.INSTANCE.send(PacketDistributor.PLAYER.with(() -> serverPlayerEntity), new SyncTransfurCapability(entity.getId(), capability.getTransfurType(), capability.isTransfured()));
                }
            }
        });
    }

    // TODO: Remove this event when we manage to get transfur capability to work properly
    @SubscribeEvent
    public static void onEntityItemPickup(EntityItemPickupEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> { capability.setTransfurType(1);capability.setTransfured(true); });
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD)
            event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> Main.LOGGER.debug(event.getEntity() + "'s isTransfured: " + capability.isTransfured()));
    }

    // TODO: Find better way to handle rendering
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
        PlayerEntity player = event.getPlayer();
        player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> {
            if (!capability.isTransfured()) return;
            event.setCanceled(true);
            switch(capability.getTransfurType()) {
                case 1:
                    PlayerDarkLatexFoxRenderer<ClientPlayerEntity> playerDarkLatexFoxRenderer = new PlayerDarkLatexFoxRenderer<>(event.getRenderer().getDispatcher());
                    playerDarkLatexFoxRenderer.render((ClientPlayerEntity) player, 0.0f, 0.0f, event.getMatrixStack(), event.getBuffers(), event.getLight());
                    break;
                case 2:
                    // Placeholder
                    break;
            }
        });
    }

    //TODO: Find better way to handle rendering
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onRenderPlayerHandPre(RenderHandEvent event) {
//        ClientPlayerEntity player = Minecraft.getInstance().player;
//        if (player == null) return;
//        player.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(capability -> {
//            if (!capability.isTransfured()) return;
//            event.setCanceled(true);
//            switch(capability.getTransfurType()) {
//                case 1:
////                    PlayerDarkLatexFoxModel<ClientPlayerEntity> playerDarkLatexFoxModel = new PlayerDarkLatexFoxModel<>();
////                    playerDarkLatexFoxModel.translateToHand(event.getHand() == Hand.MAIN_HAND ? HandSide.RIGHT : HandSide.LEFT, event.getMatrixStack());
//                    PlayerDarkLatexFoxRenderer<ClientPlayerEntity> playerDarkLatexFoxRenderer = new PlayerDarkLatexFoxRenderer<>(Minecraft.getInstance().getEntityRenderDispatcher());
//                    playerDarkLatexFoxRenderer.getModel().translateToHand(event.getHand() == Hand.MAIN_HAND ? HandSide.LEFT : HandSide.RIGHT, event.getMatrixStack());
//                    playerDarkLatexFoxRenderer.render(player, 0.0f, 0.0f, event.getMatrixStack(), event.getBuffers(), event.getLight());
//                    break;
//                case 2:
//                    // Placeholder
//                    break;
//            }
//        });
    }
}