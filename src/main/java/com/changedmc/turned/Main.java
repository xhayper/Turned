package com.changedmc.turned;

import com.changedmc.turned.config.ClientConfig;
import com.changedmc.turned.config.CommonConfig;
import com.changedmc.turned.config.ServerConfig;
import com.changedmc.turned.event.EventManager;
import com.changedmc.turned.util.Reference;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public Main() {
        EventManager.registerEvents();
        if (CommonConfig.debug.get() || Reference.DEBUG_BUILD) LOGGER.debug("Registering Config");
        registerConfig();
    }

    public void registerConfig() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC, Reference.MOD_ID + "-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ServerConfig.SPEC, Reference.MOD_ID + "-server.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC, Reference.MOD_ID + "-common.toml");
    }

}
