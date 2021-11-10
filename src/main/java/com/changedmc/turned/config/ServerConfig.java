package com.changedmc.turned.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> instantTransfur;

    static {
        instantTransfur = BUILDER.comment("Should the mod transfur you instantly when you stop on latex puddles?").define("instantTransfur", true);
        SPEC = BUILDER.build();
    }
}
