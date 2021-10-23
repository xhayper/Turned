package com.changedmc.turned;

import com.changedmc.turned.event.EventManager;
import com.changedmc.turned.util.Reference;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();

    public Main() { EventManager.registerEvents(); }
}
