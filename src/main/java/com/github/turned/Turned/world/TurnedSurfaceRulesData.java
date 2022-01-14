package com.github.turned.Turned.world;

import com.github.turned.Turned.deferredregister.TurnedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class TurnedSurfaceRulesData {

    private static final SurfaceRules.RuleSource DARK_LATEX_BLOCK = makeStateRule(TurnedBlock.DARK_LATEX_BLOCK.get());
    private static final SurfaceRules.RuleSource HARMLESS_DARK_LATEX_BLOCK = makeStateRule(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get());

    protected static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource darkLatexSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, HARMLESS_DARK_LATEX_BLOCK), DARK_LATEX_BLOCK);

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(TurnedBiomes.DARK_LATEX), DARK_LATEX_BLOCK),
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, darkLatexSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
