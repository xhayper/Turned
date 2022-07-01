package io.github.changedmc.turned.entity.ai;

import io.github.changedmc.turned.capability.transfur.ITransfurCapability;
import io.github.changedmc.turned.capability.transfur.TransfurCapability;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class LatexMeleeAttackGoal extends MeleeAttackGoal {
    public LatexMeleeAttackGoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
    }

    @Override
    public boolean canUse() {
        return !this.mob.isBaby() && super.canUse();
    }

    public boolean canContinueToUse() {
        if (this.mob.isBaby()) return false;
        LivingEntity livingEntity = this.mob.getTarget();
        if (livingEntity == null) return false;
        ITransfurCapability transfurCapability = livingEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).resolve().orElse(null);
        if (transfurCapability != null && (transfurCapability.isTransfured() || transfurCapability.getLatexLevel() >= 100))
            return false;
        else return super.canContinueToUse();
    }
}
