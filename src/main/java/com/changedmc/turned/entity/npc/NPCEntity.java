package com.changedmc.turned.entity.npc;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class NPCEntity extends CreatureEntity {

    public NPCEntity(EntityType<? extends CreatureEntity> type, World worldIn) { super(type, worldIn); }

    public static AttributeModifierMap.MutableAttribute createAttributes() { return LivingEntity.createLivingAttributes().add(Attributes.FOLLOW_RANGE, 1.0F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.MOVEMENT_SPEED, 0.1F).add(Attributes.ATTACK_SPEED).add(Attributes.LUCK).add(net.minecraftforge.common.ForgeMod.REACH_DISTANCE.get()).add(Attributes.ATTACK_KNOCKBACK); }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 1.2d));
    }

    @Nonnull
    public SoundCategory getSoundSource() {
        return SoundCategory.NEUTRAL;
    }

    @Nonnull
    protected SoundEvent getSwimSound() {
        return SoundEvents.PLAYER_SWIM;
    }

    @Nonnull
    protected SoundEvent getSwimSplashSound() {
        return SoundEvents.PLAYER_SPLASH;
    }

    protected SoundEvent getHurtSound(@Nonnull DamageSource damageSource) {
        return SoundEvents.PLAYER_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.PLAYER_DEATH;
    }

    @Nonnull
    protected SoundEvent getFallDamageSound(int fallDistance) { return fallDistance > 4 ? SoundEvents.PLAYER_BIG_FALL : SoundEvents.PLAYER_SMALL_FALL; }
}
