package com.changedmc.turned.capability.transfur;

public interface ITransfurCapability {
    void setTransfured(boolean isTransfured);

    boolean isTransfured();

    int getTransfurType();

    void setTransfurType(int transfurType);
}
