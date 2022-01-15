package io.github.changedmc.turned.world;

import io.github.changedmc.turned.deferredregister.TurnedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class TurnedSurfaceRulesData {

    private static final SurfaceRules.RuleSource DARK_LATEX_BLOCK = makeStateRule(TurnedBlock.DARK_LATEX_BLOCK.get());
    private static final SurfaceRules.RuleSource HARMLESS_DARK_LATEX_BLOCK = makeStateRule(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get());

    protected static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        return SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(), SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, HARMLESS_DARK_LATEX_BLOCK), DARK_LATEX_BLOCK)));
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
