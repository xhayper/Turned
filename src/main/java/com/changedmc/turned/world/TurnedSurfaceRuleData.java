package com.changedmc.turned.world;

import com.changedmc.turned.deferredregister.TurnedBiome;
import com.changedmc.turned.deferredregister.TurnedBlock;
import net.minecraft.world.level.levelgen.SurfaceRules;

// Thank you, https://github.com/TeamLapen/Vampirism/blob/1aaa5a48eb67dc5f68046df3dda6c994701be637/src/main/java/de/teamlapen/vampirism/core/ModBiomes.java
public class TurnedSurfaceRuleData {

    public static SurfaceRules.RuleSource dark_latex() {
        SurfaceRules.RuleSource surfaceBlock = SurfaceRules.state(TurnedBlock.HARMLESS_DARK_LATEX_BLOCK.get().defaultBlockState());
        SurfaceRules.RuleSource undergroundBlock = SurfaceRules.state(TurnedBlock.DARK_LATEX_BLOCK.get().defaultBlockState());
        SurfaceRules.ConditionSource inDarkLatexBiome = SurfaceRules.isBiome(TurnedBiome.DARK_LATEX_KEY);
        SurfaceRules.RuleSource surfaceLayer = SurfaceRules.ifTrue(inDarkLatexBiome, surfaceBlock);
        SurfaceRules.RuleSource undergroundLayer = SurfaceRules.ifTrue(inDarkLatexBiome, undergroundBlock);
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.sequence(surfaceLayer))),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.sequence(undergroundLayer)))
                        ))
        );
    }

}
