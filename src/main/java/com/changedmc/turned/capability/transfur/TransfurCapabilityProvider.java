package com.changedmc.turned.capability.transfur;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;

public class TransfurCapabilityProvider implements ICapabilitySerializable<CompoundTag> {

    private Entity entity;

    public TransfurCapabilityProvider(Entity entity) {
        this.entity = entity;
    }

    final DefaultTransfurCapability defaultTransfurCapability = new DefaultTransfurCapability();
    final LazyOptional<ITransfurCapability> opt = LazyOptional.of(() -> {
        defaultTransfurCapability.setEntity(this.entity);
        return defaultTransfurCapability;
    });

    public void invalidate() {
        opt.invalidate();
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, Direction facing) {
        return opt.cast();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        if (TransfurCapability.TRANSFUR_CAPABILITY != null) {
            defaultTransfurCapability.setTransfurType(nbt.getInt("transfurType"));
            defaultTransfurCapability.setTransfured(nbt.getBoolean("isTransfured"));
        }
    }

    @Override
    public CompoundTag serializeNBT() {
        if (TransfurCapability.TRANSFUR_CAPABILITY == null) {
            return new CompoundTag();
        } else {
            CompoundTag compoundNBT = new CompoundTag();
            compoundNBT.putInt("transfurType", defaultTransfurCapability.getTransfurType());
            compoundNBT.putBoolean("isTransfured", defaultTransfurCapability.isTransfured());
            return compoundNBT;
        }
    }

}
