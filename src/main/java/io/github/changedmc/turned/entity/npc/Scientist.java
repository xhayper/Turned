package io.github.changedmc.turned.entity.npc;

import io.github.changedmc.turned.entity.PlayerLike;
import io.github.changedmc.turned.entity.latex.Latex;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Scientist extends PlayerLike {
    private static final EntityDataAccessor<Boolean> DATA_EVIL_ID = SynchedEntityData.defineId(Scientist.class, EntityDataSerializers.BOOLEAN);

    public Scientist(EntityType<? extends PlayerLike> type, Level levelIn) {
        super(type, levelIn);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Scientist.class, 6.0F));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Latex.class, 6.0F));
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(@Nonnull ServerLevelAccessor serverLevelAccessor, @Nonnull DifficultyInstance difficultyInstance, @Nonnull MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag compoundTag) {
        this.setEvil(this.random.nextFloat() < 0.55F);
        return spawnGroupData;
    }

    @Override
    public void addAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putBoolean("IsEvil", this.isEvil());
    }

    @Override
    public void readAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.getEntityData().set(DATA_EVIL_ID, compoundTag.getBoolean("IsEvil"));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getEntityData().define(DATA_EVIL_ID, false);
    }

    public boolean isEvil() {
        return this.getEntityData().get(DATA_EVIL_ID);
    }

    public void setEvil(boolean isEvil) {
        this.getEntityData().set(DATA_EVIL_ID, isEvil);
    }
}
