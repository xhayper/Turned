package com.changedmc.turned;

import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.util.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        NetworkManager.registerPackets();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
