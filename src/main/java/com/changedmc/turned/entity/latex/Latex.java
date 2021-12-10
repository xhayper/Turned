package com.changedmc.turned.entity.latex;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Latex extends Monster {
    private static final EntityDataAccessor<Boolean> DATA_BABY_ID = SynchedEntityData.defineId(Latex.class, EntityDataSerializers.BOOLEAN);

    public Latex(EntityType<? extends Monster> type, Level levelIn) {
        super(type, levelIn);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.FOLLOW_RANGE, 40.0D).add(Attributes.MOVEMENT_SPEED, 0.300045D).add(Attributes.ATTACK_DAMAGE, 2.0D).add(Attributes.ARMOR, 2.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(Latex.class));
        if (this.isBaby()) {
            this.goalSelector.addGoal(4, new PanicGoal(this, 1.25D));
        } else {
            this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        }
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(@Nonnull ServerLevelAccessor serverLevelAccessor, @Nonnull DifficultyInstance difficultyInstance, @Nonnull MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag compoundTag) {
        this.setBaby(this.random.nextBoolean());
        return spawnGroupData;
    }

    public void addAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putBoolean("IsBaby", this.isBaby());
    }

    public void readAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.getEntityData().set(DATA_BABY_ID, compoundTag.getBoolean("IsBaby"));
    }

    @Nonnull
    public SoundSource getSoundSource() {
        return SoundSource.HOSTILE;
    }

    @Nonnull
    protected SoundEvent getSwimSound() {
        return SoundEvents.HOSTILE_SWIM;
    }

    @Nonnull
    protected SoundEvent getSwimSplashSound() {
        return SoundEvents.HOSTILE_SPLASH;
    }

    protected SoundEvent getHurtSound(@Nonnull DamageSource damageSource) {
        return SoundEvents.HOSTILE_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.HOSTILE_DEATH;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getEntityData().define(DATA_BABY_ID, false);
    }

    public boolean isBaby() {
        return this.getEntityData().get(DATA_BABY_ID);
    }

    public void setBaby(boolean isBaby) {
        this.getEntityData().set(DATA_BABY_ID, isBaby);
    }
}
