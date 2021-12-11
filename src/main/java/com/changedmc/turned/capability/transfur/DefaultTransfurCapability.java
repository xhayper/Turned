package com.changedmc.turned.capability.transfur;

import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.PacketDistributor;

public class DefaultTransfurCapability implements ITransfurCapability {

    private Entity entity;

    private int transfurType;
    private boolean isTransfured;

    @Override
    public int getTransfurType() {
        return transfurType;
    }

    @Override
    public void setTransfurType(int type) {
        this.transfurType = type;
        this.syncCapability();
    }

    @Override
    public boolean isTransfured() {
        return this.isTransfured;
    }

    @Override
    public void setTransfured(boolean isTransfured) {
        this.isTransfured = isTransfured;
        this.syncCapability();
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void syncCapability() {
        if (!(this.entity instanceof ServerPlayer)) return;
        NetworkManager.INSTANCE.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> this.entity), new SyncTransfurCapability(this.entity.getId(), this.transfurType, this.isTransfured()));
    }
}
