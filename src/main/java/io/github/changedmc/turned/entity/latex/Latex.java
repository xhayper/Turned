package io.github.changedmc.turned.entity.latex;

import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import io.github.changedmc.turned.config.TurnedServerConfig;
import io.github.changedmc.turned.entity.ai.LatexMeleeAttackGoal;
import io.github.changedmc.turned.entity.ai.LatexNearestAttackableTargetGoal;
import io.github.changedmc.turned.entity.ai.LatexPanicGoal;
import io.github.changedmc.turned.entity.npc.Scientist;
import io.github.changedmc.turned.util.Utility;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class Latex extends PathfinderMob {

    private static final EntityDataAccessor<String> DATA_ORIGINAL_ENTITY_TYPE = SynchedEntityData.defineId(Latex.class, EntityDataSerializers.STRING);

    public Latex(EntityType<? extends PathfinderMob> type, Level levelIn) {
        super(type, levelIn);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.FOLLOW_RANGE, 35.0D).add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.ARMOR, 2.0D);
    }

    @Override
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

//    @Override
//    public boolean hurt(@Nonnull DamageSource pSource, float pAmount) {
//        return false;
//    } // Immunity :)

    @Override
    public boolean doHurtTarget(@Nonnull Entity entity) {
        ITransfurCapability transfurCapability = entity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability == null || (transfurCapability.isTransfured() || transfurCapability.getLatexLevel() >= 100))
            return false;
        boolean flag = super.doHurtTarget(entity);
        if (flag) {
            if ((!(entity instanceof Player player) || !usingShield(player))) {
                int nextLevel = Math.min(transfurCapability.getLatexLevel() + this.random.nextInt(10) + 1, 100);
                if (nextLevel >= 100 || TurnedServerConfig.INSTANT_TRANSFUR.get()) {
                    Utility.transfur(this, entity, null, transfurCapability);
                } else {
                    transfurCapability.setLatexLevel(nextLevel);
                    transfurCapability.syncCapability();
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

    @Override
    @Nonnull
    public SoundSource getSoundSource() {
        return SoundSource.HOSTILE;
    }

    @Override
    @Nonnull
    protected SoundEvent getSwimSound() {
        return SoundEvents.HOSTILE_SWIM;
    }

    @Override
    @Nonnull
    protected SoundEvent getSwimSplashSound() {
        return SoundEvents.HOSTILE_SPLASH;
    }

    @Override
    protected SoundEvent getHurtSound(@Nonnull DamageSource damageSource) {
        return SoundEvents.HOSTILE_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.HOSTILE_DEATH;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.getEntityData().define(DATA_ORIGINAL_ENTITY_TYPE, "");
    }

    @Override
    public void addAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putString("OriginalEntityType", this.getOriginalEntityType() != null && this.getOriginalEntityType().getRegistryName() != null ? this.getOriginalEntityType().getRegistryName().toString() : "");
    }

    @Override
    public void readAdditionalSaveData(@Nonnull CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.getEntityData().set(DATA_ORIGINAL_ENTITY_TYPE, compoundTag.getString("OriginalEntityType"));
    }

    public void setOriginalEntityType(EntityType<? extends Mob> entityType) {
        this.getEntityData().set(DATA_ORIGINAL_ENTITY_TYPE, entityType.getRegistryName() != null ? entityType.getRegistryName().toString() : "");
    }

    @Nullable
    public EntityType<? extends Mob> getOriginalEntityType() {
        String key = this.getEntityData().get(DATA_ORIGINAL_ENTITY_TYPE);
        if (key.equals("")) return null;
        EntityType<?> entityType = EntityType.byString(key).orElse(null);
        return entityType != null ? Utility.getTypedType(entityType) : null;
    }

    @Override
    protected float getStandingEyeHeight(@Nonnull Pose pose, @Nonnull EntityDimensions entityDimensions) {
        return this.isBaby() ? 0.93F : 1.74F;
    }
}
