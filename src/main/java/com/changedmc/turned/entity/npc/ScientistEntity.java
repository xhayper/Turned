package com.changedmc.turned.entity.npc;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import java.util.Random;

public class ScientistEntity extends NPCEntity {
    private static final DataParameter<Boolean> DATA_MOB_EVIL = EntityDataManager.defineId(ScientistEntity.class, DataSerializers.BOOLEAN);

    public ScientistEntity(EntityType<? extends CreatureEntity> type, World worldIn) { super(type, worldIn); }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_MOB_EVIL, new Random().nextBoolean());
    }

    public boolean isEvil() {
        return this.entityData.get(DATA_MOB_EVIL);
    }
}
