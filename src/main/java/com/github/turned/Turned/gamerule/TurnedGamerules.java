package com.github.turned.Turned.gamerule;

import com.github.turned.Turned.util.GamerulesUtility;
import net.minecraft.world.level.GameRules;

public class TurnedGamerules {
    public static final GameRules.Key<GameRules.BooleanValue> RULE_DO_DARK_LATEX_SPREAD = GameRules.register("doDarkLatexSpread", GameRules.Category.UPDATES, GamerulesUtility.BooleanValue.create(true));
}
