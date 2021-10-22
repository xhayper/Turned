package com.changedmc.turned.capability.transfur;

import com.changedmc.turned.Main;
import com.changedmc.turned.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CapabilityAttachmentHandler {
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof PlayerEntity) {
            Main.LOGGER.info("Trying to attach capability");
            TransfurCapabilityProvider provider = new TransfurCapabilityProvider();
            event.addCapability(new ResourceLocation(Reference.MOD_ID, "transfur_capability"), provider);
            event.addListener(provider::invalidate);
            /*new Thread(() -> {
                try {
                    Main.LOGGER.info("Is ClientSide : " + event.getObject().level.isClientSide());
                    event.getObject().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                        Main.LOGGER.info("isTransfured: " + iTransfurCapability.isTransfured());
                    });
                    Thread.sleep(1000);
                    event.getObject().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                        iTransfurCapability.setTransfured(true);
                    });
                    Thread.sleep(1000);
                    Main.LOGGER.info("Is ClientSide : " + event.getObject().level.isClientSide());
                    event.getObject().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                        Main.LOGGER.info("isTransfured: " + iTransfurCapability.isTransfured());
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();*/

        }
    }
    public static void on_pickup(EntityItemPickupEvent event) {
        Main.LOGGER.info("Item pickup event");
        boolean is_client_side = event.getEntity().level.isClientSide();
        if (is_client_side == false) {
            event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                iTransfurCapability.setTransfured(!iTransfurCapability.isTransfured());
            });
            event.getEntity().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                Main.LOGGER.info("isTransfured: " + iTransfurCapability.isTransfured());
            });
        }
    }
}
