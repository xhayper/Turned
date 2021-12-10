package com.changedmc.turned.event;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.BaseCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.util.Reference;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import javax.annotation.Nonnull;

//https://github.com/TeamTwilight/twilightforest/blob/1.18.x/src/main/java/twilightforest/capabilities/CapabilityList.java

public class EventCapability {

    public static void addCapability(AttachCapabilitiesEvent<Entity> event, ResourceLocation resourceLocation, BaseCapability baseCapability) {
        event.addCapability(resourceLocation, new ICapabilitySerializable<CompoundTag>() {
            final LazyOptional<? extends BaseCapability> capability = LazyOptional.of(() -> {
                baseCapability.setEntity(event.getObject());
                return baseCapability;
            });

            @Nonnull
            @Override
            public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, Direction facing) {
                return this.capability.cast();
            }

            @Override
            public CompoundTag serializeNBT() {
                return capability.orElseThrow(NullPointerException::new).serializeNBT();
            }

            @Override
            public void deserializeNBT(CompoundTag compoundTag) {
                capability.orElseThrow(NullPointerException::new).deserializeNBT(compoundTag);
            }
        });
    }

    @SubscribeEvent
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD)
            Main.LOGGER.debug("Attaching Transfur Capability to an Entity");
        addCapability(event, new ResourceLocation(Reference.MOD_ID, "transfur"), new TransfurCapability());
    }
}
