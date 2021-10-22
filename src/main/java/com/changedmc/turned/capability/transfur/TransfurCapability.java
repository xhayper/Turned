package com.changedmc.turned.capability.transfur;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import javax.annotation.Nullable;

public class TransfurCapability {

    @CapabilityInject(ITransfur.class)
    public static Capability<ITransfur> TRANSFUR_CAPABILITY = null;

    public static void registerCapabilities() {
        CapabilityManager.INSTANCE.register(ITransfur.class, new TransfurStorage(), Transfur::new);
    }

    public static class TransfurStorage implements Capability.IStorage<ITransfur> {
        @Nullable
        @Override
        public INBT writeNBT(Capability<ITransfur> capability, ITransfur instance, Direction side) {
            CompoundNBT compoundNBT = new CompoundNBT();
            compoundNBT.putInt("transfurType", instance.getTransfurType());
            compoundNBT.putBoolean("isTransfured", instance.isTranfured());
            return compoundNBT;
        }

        @Override
        public void readNBT(Capability<ITransfur> capability, ITransfur instance, Direction side, INBT nbt) {
            CompoundNBT compoundNBT = (CompoundNBT) nbt;
            instance.setTransfurType(compoundNBT.getInt("transfurType"));
            instance.setTransfured(compoundNBT.getBoolean("isTransfured"));
        }
    }
}
