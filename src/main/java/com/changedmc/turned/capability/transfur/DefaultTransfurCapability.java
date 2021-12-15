package com.changedmc.turned.capability.transfur;

import com.changedmc.turned.reference.networking.NetworkManager;
import com.changedmc.turned.reference.networking.packet.server.SyncTransfurCapability;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.PacketDistributor;

public class DefaultTransfurCapability implements ITransfurCapability {

    private Entity entity;

    private int transfurType;
    private int latexLevel;
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

    @Override
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    @Override
    public int getLatexLevel() {
        return this.latexLevel;
    }

    @Override
    public void setLatexLevel(int latexLevel) {
        this.latexLevel = Math.min(latexLevel, 100);
        this.syncCapability();
    }

    @Override
    public void syncCapability() {
        if (!(this.entity instanceof ServerPlayer)) return;
        NetworkManager.INSTANCE.send(PacketDistributor.ALL.noArg(), new SyncTransfurCapability(this.entity.getId(), this.transfurType, this.getLatexLevel(), this.isTransfured()));
    }

    @Override
    public void syncTo(ServerPlayer player) {
        NetworkManager.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new SyncTransfurCapability(this.entity.getId(), this.transfurType, this.getLatexLevel(), this.isTransfured()));
    }
}
