package io.github.changedmc.turned;

import io.github.changedmc.turned.config.TurnedClientConfig;
import io.github.changedmc.turned.config.TurnedCommonConfig;
import io.github.changedmc.turned.config.TurnedServerConfig;
import io.github.changedmc.turned.event.EventManager;
import io.github.changedmc.turned.reference.TurnedReference;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TurnedReference.MOD_ID)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger(TurnedReference.MOD_ID);

    public Main() {
        EventManager.registerEvents();
        if (TurnedCommonConfig.debug.get() || TurnedReference.DEBUG_BUILD) LOGGER.debug("Registering Config");
        registerConfig();
    }

    public void registerConfig() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, TurnedClientConfig.SPEC, TurnedReference.MOD_ID + "-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, TurnedServerConfig.SPEC, TurnedReference.MOD_ID + "-server.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TurnedCommonConfig.SPEC, TurnedReference.MOD_ID + "-common.toml");
    }

}
