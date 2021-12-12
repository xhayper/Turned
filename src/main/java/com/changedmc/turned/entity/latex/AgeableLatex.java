package com.changedmc.turned.entity.latex;

import com.changedmc.turned.config.TurnedServerConfig;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;

public class AgeableLatex extends Latex {
    private static final EntityDataAccessor<Boolean> DATA_BABY_ID = SynchedEntityData.defineId(AgeableLatex.class, EntityDataSerializers.BOOLEAN);

    public AgeableLatex(EntityType<? extends PathfinderMob> type, Level levelIn) {
        super(type, levelIn);
    }

    public static boolean getSpawnAsBabyOdds(Random random) {
        return random.nextFloat() < TurnedServerConfig.latexBabyChance.get();
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(@Nonnull ServerLevelAccessor serverLevelAccessor, @Nonnull DifficultyInstance difficultyInstance, @Nonnull MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag compoundTag) {
        this.setBaby(getSpawnAsBabyOdds(this.random));
        return spawnGroupData;
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getEntityData().define(DATA_BABY_ID, false);
    }

    public void addAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putBoolean("IsBaby", this.isBaby());
    }

    public void readAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.getEntityData().set(DATA_BABY_ID, compoundTag.getBoolean("IsBaby"));
    }

    public boolean isBaby() {
        return this.getEntityData().get(DATA_BABY_ID);
    }

    public void setBaby(boolean isBaby) {
        this.getEntityData().set(DATA_BABY_ID, isBaby);
    }
}
