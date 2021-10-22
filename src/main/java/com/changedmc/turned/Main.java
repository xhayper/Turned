package com.changedmc.turned;

import com.changedmc.turned.capability.transfur.TransfurCapability;
import com.changedmc.turned.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        MinecraftForge.EVENT_BUS.register(this);
        TransfurCapability.registerCapabilities();
    }
}
