package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TurnedClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        SPEC = BUILDER.build();
    }
}
