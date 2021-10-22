package com.changedmc.turned.capability;

public class DefaultTransfurCapability implements ITransfurCapability{
    private int value = 0;

    @Override
    public void setValue(int value_) {
        this.value = value_;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
