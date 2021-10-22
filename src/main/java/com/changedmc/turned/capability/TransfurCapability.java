package com.changedmc.turned.capability;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

import javax.annotation.Nullable;

public class TransfurCapability {
    @CapabilityInject(ITransfurCapability.class)
    public static Capability<ITransfurCapability> TRANSFUR_CAPABILITY = null;

    public static void register() {
        CapabilityManager.INSTANCE.register(ITransfurCapability.class, new Storage(), DefaultTransfurCapability::new);
    }


    public static class Storage implements Capability.IStorage<ITransfurCapability> {

        @Nullable
        @Override
        public INBT writeNBT(Capability<ITransfurCapability> capability, ITransfurCapability instance, Direction side) {
            CompoundNBT tag = new CompoundNBT();
            tag.putInt("pickupcount", instance.getValue());
            return tag;
        }

        @Override
        public void readNBT(Capability<ITransfurCapability> capability, ITransfurCapability instance, Direction side, INBT nbt) {
            int value = ((CompoundNBT) nbt).getInt("pickupcount");
            instance.setValue(value);
        }
    }
}