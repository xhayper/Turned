package com.changedmc.turned.capability.transfur;

import com.changedmc.turned.capability.BaseCapability;


public interface ITransfurCapability extends BaseCapability {
    boolean isTransfured();

    void setTransfured(boolean isTransfured);

    int getTransfurType();

    void setTransfurType(int transfurType);
}
