package io.github.changedmc.turned.capability.transfur;

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
}
