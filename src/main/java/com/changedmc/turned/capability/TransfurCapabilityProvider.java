package com.changedmc.turned.capability;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TransfurCapabilityProvider implements ICapabilitySerializable<CompoundNBT> {

    private final DefaultTransfurCapability pickup = new DefaultTransfurCapability();
    private final LazyOptional<ITransfurCapability> pickupOptional = LazyOptional.of(() -> pickup);

    public void invalidate() {
        pickupOptional.invalidate();
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return pickupOptional.cast();
    }

    @Override
    public CompoundNBT serializeNBT() {
        if (TransfurCapability.TRANSFUR_CAPABILITY == null) {
            return new CompoundNBT();
        } else {
            return (CompoundNBT) TransfurCapability.TRANSFUR_CAPABILITY .writeNBT(pickup, null);
        }
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        if (TransfurCapability.TRANSFUR_CAPABILITY  != null) {
            TransfurCapability.TRANSFUR_CAPABILITY .readNBT(pickup, null, nbt);
        }
    }
}