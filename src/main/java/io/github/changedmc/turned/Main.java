package io.github.changedmc.turned;

import io.github.changedmc.turned.config.TurnedClientConfig;
import io.github.changedmc.turned.config.TurnedCommonConfig;
import io.github.changedmc.turned.config.TurnedServerConfig;
import io.github.changedmc.turned.event.EventManager;
import io.github.changedmc.turned.reference.Reference;
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
        if (TurnedCommonConfig.debug.get() || Reference.DEBUG_BUILD) LOGGER.debug("Registering Config");
        registerConfig();
    }

    public void registerConfig() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, TurnedClientConfig.SPEC, Reference.MOD_ID + "-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, TurnedServerConfig.SPEC, Reference.MOD_ID + "-server.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TurnedCommonConfig.SPEC, Reference.MOD_ID + "-common.toml");
    }

}
