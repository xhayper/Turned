package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> instantTransfur;

    static {
        instantTransfur = BUILDER.define("instantTransfur", true);
        SPEC = BUILDER.build();
    }
}
