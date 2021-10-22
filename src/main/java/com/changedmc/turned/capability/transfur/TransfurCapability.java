package com.changedmc.turned.capability.transfur;

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
        CapabilityManager.INSTANCE.register(ITransfurCapability.class, new TransfurStorage(), DefaultTransfurCapability::new);
    }

    public static class TransfurStorage implements Capability.IStorage<ITransfurCapability> {
        @Nullable
        @Override
        public INBT writeNBT(Capability<ITransfurCapability> capability, ITransfurCapability instance, Direction side) {
            CompoundNBT compoundNBT = new CompoundNBT();
            compoundNBT.putInt("transfurType", instance.getTransfurType());
            compoundNBT.putBoolean("is_transfured", instance.isTransfured());
            return compoundNBT;
        }

        @Override
        public void readNBT(Capability<ITransfurCapability> capability, ITransfurCapability instance, Direction side, INBT nbt) {
            CompoundNBT compoundNBT = ((CompoundNBT) nbt);
            instance.setTransfured(compoundNBT.getBoolean("is_transfured"));
            instance.setTransfurType(compoundNBT.getInt("transfurType"));
        }
    }
}