package com.changedmc.turned.entity.ai;

import com.changedmc.turned.capability.transfur.TransfurCapability;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class LatexMeleeAttackGoal extends MeleeAttackGoal {
    public LatexMeleeAttackGoal(PathfinderMob p_25552_, double p_25553_, boolean p_25554_) {
        super(p_25552_, p_25553_, p_25554_);
    }

    public boolean canContinueToUse() {
        LivingEntity livingEntity = this.mob.getTarget();
        if (livingEntity == null || livingEntity.getCapability(TransfurCapability.TRANSFUR_CAPABILITY).orElseThrow(NullPointerException::new).isTransfured()) return false;
        return super.canContinueToUse();
    }
}
