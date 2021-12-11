package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TurnedServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue instantTransfur;
    public static final ForgeConfigSpec.DoubleValue latexBabyChance;

    static {
        instantTransfur = BUILDER.comment("Should the mod transfur you instantly when you stop on latex puddles?").define("instantTransfur", true);
        latexBabyChance = BUILDER.comment("Chance that a AgeableLatex (or subclass) is a baby. Allows changing the ageable latex spawning mechanic.").defineInRange("latexBabyChance", 0.05D, 0.0D, 1.0D);
        SPEC = BUILDER.build();
    }
}
