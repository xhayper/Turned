package com.changedmc.turned.entity.ai;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.entity.latex.Latex;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.function.Predicate;

public class LatexNearestAttackableTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {

    public LatexNearestAttackableTargetGoal(Mob pMob, Class<T> pTargetType, boolean pMustSee) {
        this(pMob, pTargetType, 10, pMustSee, false, null);
    }

    public LatexNearestAttackableTargetGoal(Mob pMob, Class<T> pTargetType, boolean pMustSee, Predicate<LivingEntity> pTargetPredicate) {
        this(pMob, pTargetType, 10, pMustSee, false, pTargetPredicate);
    }

    public LatexNearestAttackableTargetGoal(Mob pMob, Class<T> pTargetType, boolean pMustSee, boolean pMustReach) {
        this(pMob, pTargetType, 10, pMustSee, pMustReach, null);
    }

    public LatexNearestAttackableTargetGoal(Mob pMob, Class<T> pTargetType, int pRandomInterval, boolean pMustSee, boolean pMustReach, @Nullable Predicate<LivingEntity> pTargetPredicate) {
        super(pMob, pTargetType, pRandomInterval, pMustSee, pMustReach, (LivingEntity livingEntity) -> {
            if (livingEntity instanceof Latex) return false;
            ITransfurCapability transfurCapability = livingEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
            return (transfurCapability == null || (!transfurCapability.isTransfured() || transfurCapability.getLatexLevel() >= 100)) && (pTargetPredicate == null || pTargetPredicate.test(livingEntity));
        });
    }

    @Override
    public boolean canUse() {
        return !this.mob.isBaby() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return !this.mob.isBaby() && super.canContinueToUse();
    }
}
