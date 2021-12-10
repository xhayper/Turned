package com.changedmc.turned.capability;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.util.INBTSerializable;

public interface BaseCapability extends INBTSerializable<CompoundTag> {
    void setEntity(Entity entity);
}
