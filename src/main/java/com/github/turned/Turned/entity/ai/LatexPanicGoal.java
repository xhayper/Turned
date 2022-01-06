package com.github.turned.Turned.entity.ai;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.PanicGoal;

public class LatexPanicGoal extends PanicGoal {
    public LatexPanicGoal(PathfinderMob pMob, double pSpeedModifier) {
        super(pMob, pSpeedModifier);
    }

    @Override
    public boolean canUse() {
        return this.mob.isBaby() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return this.mob.isBaby() && super.canContinueToUse();
    }
}
