package com.changedmc.turned.capability;

import com.changedmc.turned.capability.transfur.ITransfurCapability;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

public class TurnedCapability {

    public static final Capability<ITransfurCapability> TRANSFUR = CapabilityManager.get(new CapabilityToken<>() {});

}
