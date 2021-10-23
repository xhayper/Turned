package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> debug;

    static {
        debug = BUILDER.define("debug", false);
        SPEC = BUILDER.build();
    }
}
