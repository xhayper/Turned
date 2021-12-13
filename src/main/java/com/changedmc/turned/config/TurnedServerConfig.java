package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TurnedServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue instantTransfur;
    public static final ForgeConfigSpec.DoubleValue latexBabyChance;
    public static final ForgeConfigSpec.IntValue darkLatexSpreadDelay;

    static {
        instantTransfur = BUILDER.comment("Should the mod ignore latex level mechanic and transfur you instantly?").define("instantTransfur", false);
        latexBabyChance = BUILDER.comment("Chance that a AgeableLatex (or subclass) is a baby. Allows changing the ageable latex spawning mechanic.").defineInRange("latexBabyChance", 0.05D, 0.0D, 1.0D);
        darkLatexSpreadDelay = BUILDER.comment("How many tick to wait before the dark latex spread?").defineInRange("darkLatexSpreadDelay", 30, 1, 60);
        SPEC = BUILDER.build();
    }
}
