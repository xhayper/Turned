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
            CompoundNBT compoundNBT = new CompoundNBT();
            compoundNBT.putInt("transfurType", instance.getTransfurType());
            compoundNBT.putBoolean("isTransfured", instance.isTransfured());
            return compoundNBT;
        }

        @Override
        public void readNBT(Capability<ITransfurCapability> capability, ITransfurCapability instance, Direction side, INBT nbt) {
            CompoundNBT compoundNBT = ((CompoundNBT) nbt);
            instance.setTransfured(compoundNBT.getBoolean("isTransfured"));
            instance.setTransfurType(compoundNBT.getInt("transfurType"));
        }
    }
}