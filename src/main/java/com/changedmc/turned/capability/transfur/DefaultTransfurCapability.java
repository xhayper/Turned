package com.changedmc.turned.capability.transfur;

public class DefaultTransfurCapability implements ITransfurCapability{
    private int transfurType;
    private boolean isTransfured;

    @Override
    public void setTransfured(boolean isTransfured) {
        this.isTransfured = isTransfured;
    }

    @Override
    public boolean isTransfured() {
        return this.isTransfured;
    }

    @Override
    public int getTransfurType() {
        return this.transfurType;
    }

    @Override
    public void setTransfurType(int transfurType) {
        this.transfurType = transfurType;
    }
}
