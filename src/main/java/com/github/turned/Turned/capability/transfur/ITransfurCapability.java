package com.github.turned.Turned.capability.transfur;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;

public interface ITransfurCapability {

    int getTransfurType();

    int getLatexLevel();

    void setTransfurType(int type);

    boolean isTransfured();

    void setTransfured(boolean isTransfured);

    void setEntity(Entity entity);

    void setLatexLevel(int level);

    void syncCapability();

    void syncTo(ServerPlayer player);
}
