package com.github.turned.Turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TurnedCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> debug;

    static {
        debug = BUILDER.define("debug", false);
        SPEC = BUILDER.build();
    }
}
