package com.changedmc.turned.capability.transfur;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

public class Transfur implements ITransfur, INBTSerializable<CompoundNBT> {
    private int transfurType;
    private boolean isTransfured;

    public Transfur() {
        this.transfurType = 0;
        this.isTransfured = false;
    }

    public Transfur(int transfurType, boolean isTransfured) {
        this.transfurType = transfurType;
        this.isTransfured = isTransfured;
    }

    @Override
    public boolean isTranfured() {
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

    @Override
    public void setTransfured(boolean isTransfured) {
        this.isTransfured = isTransfured;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT compoundNBT = new CompoundNBT();
        compoundNBT.putInt("transfurType", this.transfurType);
        compoundNBT.putBoolean("isTransfured", this.isTransfured);
        return compoundNBT;
    }

    @Override
    public void deserializeNBT(CompoundNBT compoundNBT) {
        this.transfurType = compoundNBT.getInt("transfurType");
        this.isTransfured = compoundNBT.getBoolean("isTransfured");
    }
}
