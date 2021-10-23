package com.changedmc.turned.event;

import com.changedmc.turned.capability.transfur.TransfurCapabilityProvider;
import com.changedmc.turned.entity.latex.LatexEntity;
import com.changedmc.turned.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventCapability {
    @SubscribeEvent
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (!((event.getObject() instanceof PlayerEntity) || (event.getObject() instanceof LatexEntity))) return;
        TransfurCapabilityProvider provider = new TransfurCapabilityProvider();
        event.addCapability(new ResourceLocation(Reference.MOD_ID, "transfur"), provider);
        event.addListener(provider::invalidate);
    }
}
