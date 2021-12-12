package com.changedmc.turned.entity.latex;

import com.changedmc.turned.Main;
import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.config.TurnedServerConfig;
import com.changedmc.turned.entity.ai.LatexMeleeAttackGoal;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class Latex extends PathfinderMob {
    public Latex(EntityType<? extends PathfinderMob> type, Level levelIn) {
        super(type, levelIn);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.FOLLOW_RANGE, 35.0D).add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.ARMOR, 2.0D);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, this.isBaby() ? 1.2D : 1D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 0.6D, 1));
        if (this.isBaby()) {
            this.goalSelector.addGoal(6, new PanicGoal(this, 1.25D));
        } else {
            this.goalSelector.addGoal(6, new LatexMeleeAttackGoal(this, 1.5D, false));
            this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, (LivingEntity livingEntity) -> {
                ITransfurCapability transfurCapability = livingEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
                return transfurCapability == null || (!transfurCapability.isTransfured() && 100 > transfurCapability.getLatexLevel());
            }));
        }
    }

    protected boolean usingShield(Player player) {
        return (player.isUsingItem() ? player.getUseItem() : ItemStack.EMPTY).is(Items.SHIELD);
    }

    public boolean doHurtTarget(@Nonnull Entity entity) {
        ITransfurCapability transfurCapability = entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null) return super.doHurtTarget(entity);
        if (transfurCapability.isTransfured() || transfurCapability.getLatexLevel() >= 100) return false;
        boolean flag = super.doHurtTarget(entity);
        if (flag) {
            if (!(entity instanceof Player) || !usingShield((Player) entity)) {
                if (transfurCapability.isTransfured()) return false;
                int nextLevel = Math.min(transfurCapability.getLatexLevel() + this.random.nextInt(10) + 1, 100);
                if (nextLevel >= 100 || TurnedServerConfig.instantTransfur.get()) {
                    transfurCapability.setTransfurType(this.getTransfurType());
                    transfurCapability.setTransfured(true);
                    transfurCapability.setLatexLevel(0);
                } else {
                    transfurCapability.setLatexLevel(nextLevel);
                }
            }
        }
        return flag;
    }

    public boolean canBreatheUnderwater() {
        return true;
    }

    public int getTransfurType() {
        return 0;
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

    protected float getStandingEyeHeight(@Nonnull Pose pose, @Nonnull EntityDimensions entityDimensions) {
        return this.isBaby() ? 0.93F : 1.74F;
    }
}
