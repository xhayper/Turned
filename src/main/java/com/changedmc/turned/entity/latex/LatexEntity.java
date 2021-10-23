package com.changedmc.turned.entity.latex;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import java.util.Optional;

public class LatexEntity extends CreatureEntity {
    private static final DataParameter<Boolean> DATA_TRANSFURED_ID = EntityDataManager.defineId(LatexEntity.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> DATA_TRANSFUR_TYPE_ID = EntityDataManager.defineId(LatexEntity.class, DataSerializers.INT);
    public boolean isTransfured;
    public int transfurType;

    protected LatexEntity(EntityType<? extends LatexEntity> entityType, World level) {
        super(entityType, level);
    }

    @Override
    public boolean canPickUpLoot() { return false; }

    @Override
    public boolean canBeLeashed(PlayerEntity ignored) {
        return false;
    }

    protected void registerGoals() {
        //this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(8, new RandomWalkingGoal(this, 1.2d));
        this.addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(LatexEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, livingEntity -> {
            Optional<ITransfurCapability> optional = livingEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve();
            return optional.map(iTransfurCapability -> !iTransfurCapability.isTransfured()).orElse(true);
        }));
    }

    @Override
    public boolean isBaby() {
        return false;
    }

    @Override
    public void setBaby(boolean isBaby) {
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getEntityData().define(DATA_TRANSFURED_ID, false);
        this.getEntityData().define(DATA_TRANSFUR_TYPE_ID, 0);
    }

    public void addAdditionalSaveData(@Nonnull CompoundNBT compoundNBT) {
        super.addAdditionalSaveData(compoundNBT);
        compoundNBT.putBoolean("isTransfured", this.isTransfured);
        compoundNBT.putInt("transfurType", this.transfurType);
    }

    public void readAdditionalSaveData(@Nonnull CompoundNBT compoundNBT) {
        super.readAdditionalSaveData(compoundNBT);
        this.isTransfured = compoundNBT.getBoolean("isTransfured");
        this.transfurType = compoundNBT.getInt("transfurType");
    }

    public void killed(ServerWorld serverWorld, LivingEntity livingEntity) {
        //when they kill someone
        //TODO: Insert transfur code
    }
}
