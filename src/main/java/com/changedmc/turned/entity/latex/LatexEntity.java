package com.changedmc.turned.entity.latex;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class LatexEntity extends CreatureEntity {
    public LatexEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.FOLLOW_RANGE, 40.0D).add(Attributes.MOVEMENT_SPEED, 0.300045D).add(Attributes.ATTACK_DAMAGE, 2.0D).add(Attributes.ARMOR, 2.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 1.2d));
        if (this.isBaby()) {
            this.goalSelector.addGoal(4, new PanicGoal(this, 1.25d));
        } else {
            this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, false));
            this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, livingEntity -> {
//                if (this.isBaby()) return false;
//                Optional<ITransfurCapability> optional = livingEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve();
//                return optional.map(iTransfurCapability -> !iTransfurCapability.isTransfured()).orElse(true);
                // AI above is not working
                return true;
            }));
        }
        this.targetSelector.addGoal(6, (new HurtByTargetGoal(this)).setAlertOthers(DarkLatexFoxEntity.class));
    }

    @Nonnull
    public SoundCategory getSoundSource() {
        return SoundCategory.HOSTILE;
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

    @Nonnull
    protected SoundEvent getFallDamageSound(int fallDistance) {
        return fallDistance > 4 ? SoundEvents.HOSTILE_BIG_FALL : SoundEvents.HOSTILE_SMALL_FALL;
    }
}
