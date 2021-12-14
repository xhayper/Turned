package com.changedmc.turned.entity.latex;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.config.TurnedServerConfig;
import com.changedmc.turned.entity.ai.LatexMeleeAttackGoal;
import com.changedmc.turned.entity.ai.LatexNearestAttackableTargetGoal;
import com.changedmc.turned.entity.ai.LatexPanicGoal;
import com.changedmc.turned.entity.npc.Scientist;
import com.changedmc.turned.util.Utility;
import com.google.common.collect.ImmutableList;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import java.util.List;

public abstract class Latex extends PathfinderMob {

    public Latex(EntityType<? extends PathfinderMob> type, Level levelIn) {
        super(type, levelIn);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.FOLLOW_RANGE, 35.0D).add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.ARMOR, 2.0D);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new LatexPanicGoal(this, 1.25D));
        this.goalSelector.addGoal(2, new LatexMeleeAttackGoal(this, 1.5D, false));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, this.isBaby() ? 1.2D : 1D));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new LatexNearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new LatexNearestAttackableTargetGoal<>(this, Scientist.class, true, (LivingEntity livingEntity) -> (livingEntity instanceof Scientist) && !((Scientist) livingEntity).isEvil()));
    }

    protected boolean usingShield(Player player) {
        return (player.isUsingItem() ? player.getUseItem() : ItemStack.EMPTY).is(Items.SHIELD);
    }

    public <T extends Mob> EntityType<T> getTypedType() {
        return (EntityType<T>) this.getType();
    }

    @Override
    public boolean doHurtTarget(@Nonnull Entity entity) {
        ITransfurCapability transfurCapability = entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null || (transfurCapability.isTransfured() || transfurCapability.getLatexLevel() >= 100))
            return false;
        boolean flag = super.doHurtTarget(entity);
        this.swing(InteractionHand.MAIN_HAND);
        if (flag && (!(entity instanceof Player player) || !usingShield(player)) && !transfurCapability.isTransfured()) {
            int nextLevel = Math.min(transfurCapability.getLatexLevel() + this.random.nextInt(10) + 1, 100);
            if ((nextLevel >= 100 || TurnedServerConfig.INSTANT_TRANSFUR.get())) {
                if (TurnedServerConfig.CAN_LATEX_ONLY_USE_LATEX_ITEM.get()) {
                    if (entity instanceof Player player && !player.isCreative() && !player.isSpectator()) {
                        for (List<ItemStack> list : ImmutableList.of(player.getInventory().items, player.getInventory().armor, player.getInventory().offhand)) {
                            for (int i = 0; i < list.size(); i++) {
                                ItemStack itemstack = list.get(i);
                                if (itemstack.isEmpty() || Utility.isItemLatexHoldable(itemstack.getItem())) continue;
                                ItemEntity itemEntity = Utility.dropItem(player, itemstack, true, true, true);
                                if (itemEntity != null) {
                                    list.set(i, ItemStack.EMPTY);
                                }
                            }
                        }
                    } else {
                        for (ItemStack itemstack : entity.getAllSlots()) {
                            if (itemstack.isEmpty() || Utility.isItemLatexHoldable(itemstack.getItem())) continue;
                            Utility.dropItem(entity, itemstack, true, true, true);
                        }
                    }
                }
                transfurCapability.setTransfurType(this.getTransfurType());
                transfurCapability.setTransfured(true);
                transfurCapability.setLatexLevel(0);
                if (entity instanceof Mob) {
                    Mob newMob = ((Mob) entity).convertTo(this.getTypedType(), true);
                    if (newMob == null) return true;
                    newMob.setDeltaMovement(entity.getDeltaMovement());
                }
            } else {
                transfurCapability.setLatexLevel(nextLevel);
            }
        }
        return true;
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
