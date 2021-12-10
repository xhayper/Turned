package com.changedmc.turned.capability.transfur;

import com.changedmc.turned.networking.NetworkManager;
import com.changedmc.turned.networking.packet.server.SyncTransfurCapability;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.PacketDistributor;

// https://github.com/TeamTwilight/twilightforest/blob/1.18.x/src/main/java/twilightforest/capabilities/shield/ShieldCapabilityHandler.java

public class TransfurCapability implements ITransfurCapability {

    private boolean isTransfured;
    private int transfurType;
    private Entity entity;

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag compoundTag = new CompoundTag();
        compoundTag.putBoolean("isTransfured", this.isTransfured());
        compoundTag.putInt("transfurType", this.getTransfurType());
        return compoundTag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        this.isTransfured = tag.getBoolean("isTransfured");
        this.transfurType = tag.getInt("transfurType");
    }

    @Override
    public int getTransfurType() {
        return this.transfurType;
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
    public void setTransfurType(int transfurType) {
        this.transfurType = transfurType;
        this.syncCapability();
    }

    @Override
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void syncCapability() {
        if (!(this.entity instanceof ServerPlayer)) return;
        NetworkManager.INSTANCE.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> this.entity), new SyncTransfurCapability(this.entity.getId(), this.transfurType, this.isTransfured()));
    }
}