package com.changedmc.turned.entity.npc;

import com.changedmc.turned.entity.latex.LatexEntity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

public class ScientistEntity extends PlayerLikeEntity {
    private static final DataParameter<Boolean> DATA_MOB_EVIL = EntityDataManager.defineId(ScientistEntity.class, DataSerializers.BOOLEAN);

    public ScientistEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(8, new LookAtGoal(this, ScientistEntity.class, 8.0F));
        this.goalSelector.addGoal(8, new LookAtGoal(this, LatexEntity.class, 8.0F));
    }

    public void addAdditionalSaveData(@Nonnull CompoundNBT compoundNBT) {
        super.addAdditionalSaveData(compoundNBT);
        compoundNBT.putBoolean("IsEvil", this.isEvil());
    }

    public void readAdditionalSaveData(@Nonnull CompoundNBT compoundNBT) {
        super.readAdditionalSaveData(compoundNBT);
        this.entityData.set(DATA_MOB_EVIL, compoundNBT.getBoolean("IsEvil"));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_MOB_EVIL, new Random().nextBoolean());
    }

    public boolean isEvil() {
        return this.entityData.get(DATA_MOB_EVIL);
    }
}
