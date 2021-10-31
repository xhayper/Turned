package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.client.render.latex.DarkLatexFoxRenderer;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import com.changedmc.turned.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.PacketDistributor;

public class EventEntity {
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof PlayerEntity)) return;
        if (event.getWorld().isClientSide) return;
        World world = event.getWorld();
        Entity entity = event.getEntity();
        MinecraftServer server = world.getServer();
        if (server == null) return;
        entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
            for (ServerPlayerEntity serverPlayerEntity : server.getPlayerList().getPlayers()) {
                if (serverPlayerEntity.level.dimension().location() == entity.level.dimension().location()) {
                    NetworkManager.INSTANCE.send(PacketDistributor.PLAYER.with(() -> serverPlayerEntity), new SyncTransfurCapability(entity.getId(), iTransfurCapability.getTransfurType(), iTransfurCapability.isTransfured()));
                }
            }
        });
    }

    @SubscribeEvent
    public static void onEntityItemPickup(EntityItemPickupEvent event) {
        if (event.getEntity().level.isClientSide()) return;
        event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
            iTransfurCapability.setTransfured(!iTransfurCapability.isTransfured());
        });
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD)
            event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                Main.LOGGER.debug(event.getEntity() + "'s isTransfured: " + iTransfurCapability.isTransfured());
            });
    }
        
        @SubscribeEvent
        public static void onRenderPlayerPre(RenderPlayerEvent.Pre event) {
        	PlayerEntity p = event.getPlayer();
        	if(p.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).orElseThrow(null).getTransfurType() == 1) //placeholder value check, write a different check later
        	{
        		
        
            }
        
        }
    
}
