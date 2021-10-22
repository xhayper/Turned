package com.changedmc.turned.capability.transfur;

import com.changedmc.turned.Main;
import com.changedmc.turned.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;

public class CapabilityAttachmentHandler {
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof PlayerEntity) {
            Main.LOGGER.info("Trying to attach capability");
            TransfurCapabilityProvider provider = new TransfurCapabilityProvider();
            event.addCapability(new ResourceLocation(Reference.MOD_ID, "transfur_capability"), provider);
            event.addListener(provider::invalidate);
            new Thread(() -> {
                try {
                    event.getObject().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                        Main.LOGGER.info("isTransfured: " + iTransfurCapability.isTransfured());
                    });
                    Thread.sleep(1000);
                    event.getObject().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                        iTransfurCapability.setTransfured(true);
                    });
                    Thread.sleep(1000);
                    event.getObject().getCapability(TransfurCapability.TRANSFUR_CAPABILITY).ifPresent(iTransfurCapability -> {
                        Main.LOGGER.info("isTransfured: " + iTransfurCapability.isTransfured());
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
