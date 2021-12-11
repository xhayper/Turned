package com.changedmc.turned.capability.transfur;

public interface ITransfurCapability {

    int getTransfurType();

    void setTransfurType(int type);

    boolean isTransfured();

    void setTransfured(boolean isTransfured);

    void syncCapability();
}
