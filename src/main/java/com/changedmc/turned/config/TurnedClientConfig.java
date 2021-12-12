package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TurnedClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> enderDragonBooba;

    static {
        enderDragonBooba = BUILDER.define("enderDragonBooba", false);
        SPEC = BUILDER.build();
    }
}
