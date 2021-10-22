package com.changedmc.turned.entity.latex;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class LatexEntity extends MonsterEntity {
    public boolean isTransfured;
    public int transfurType;

    private static final DataParameter<Boolean> DATA_TRANSFURED_ID = EntityDataManager.defineId(LatexEntity.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> DATA_TRANSFUR_TYPE_ID = EntityDataManager.defineId(LatexEntity.class, DataSerializers.INT);

    protected LatexEntity(EntityType<? extends LatexEntity> p_i48553_1_, World p_i48553_2_) {
        super(p_i48553_1_, p_i48553_2_);
    }

    protected void registerGoals() {
        //this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
        this.addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(LatexEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public void setBaby(boolean p_82227_1_) { }

    @Override
    public boolean isBaby() {
        return false;
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getEntityData().define(DATA_TRANSFURED_ID, false);
        this.getEntityData().define(DATA_TRANSFUR_TYPE_ID, 0);
    }

    public void addAdditionalSaveData(CompoundNBT compoundNBT) {
        super.addAdditionalSaveData(compoundNBT);
        compoundNBT.putBoolean("isTransfured", this.isTransfured);
        compoundNBT.putInt("transfurType", this.transfurType);
    }

    public void readAdditionalSaveData(CompoundNBT compoundNBT) {
        super.readAdditionalSaveData(compoundNBT);
        this.isTransfured = compoundNBT.getBoolean("isTransfured");
        this.transfurType = compoundNBT.getInt("transfurType");
    }

    // public void killed(ServerWorld p_241847_1_, LivingEntity p_241847_2_) {
    // when they kill someone
}
