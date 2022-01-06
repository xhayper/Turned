package com.github.turned.Turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TurnedServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue INSTANT_TRANSFUR;
    public static final ForgeConfigSpec.DoubleValue LATEX_BABY_CHANCE;
    public static final ForgeConfigSpec.IntValue DARK_LATEX_SPREAD_DELAY;
    public static final ForgeConfigSpec.BooleanValue CAN_LATEX_ONLY_USE_LATEX_ITEM;

    static {
        INSTANT_TRANSFUR = BUILDER.comment("Should the mod ignore latex level mechanic and transfur you instantly?").define("instantTransfur", false);
        LATEX_BABY_CHANCE = BUILDER.comment("Chance that a AgeableLatex (or subclass) is a baby. Allows changing the ageable latex spawning mechanic.").defineInRange("latexBabyChance", 0.05D, 0.0D, 1.0D);
        DARK_LATEX_SPREAD_DELAY = BUILDER.comment("How many tick to wait before the dark latex spread?").defineInRange("darkLatexSpreadDelay", 30, 0, Integer.MAX_VALUE);
        CAN_LATEX_ONLY_USE_LATEX_ITEM = BUILDER.comment("Should we make it so the latex can't use, pick up or whatever for non latex item?").define("canLatexOnlyUseLatexItem", false);
        SPEC = BUILDER.build();
    }
}
