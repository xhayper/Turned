package com.changedmc.turned.capability;

import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

public class TransfurProvider implements ICapabilitySerializable<INBT>
{
	 @CapabilityInject(ITransfur.class)
	 public static final Capability<ITransfur> TRANS_CAP = null;
	 
	 private ITransfur instance = TRANS_CAP.getDefaultInstance();
	 
	 @Override
	 public boolean hasCapability(Capability<?> capability, Direction facing)
	 {
		 
	 return capability == TRANS_CAP;
	 
	 }

	 //@Override
	 //public <T> T getCapability(Capability<T> capability, Direction facing)
	 //{
		 
	 //return capability == TRANS_CAP ? TRANS_CAP.<T> cast(this.instance) : null;
	 
	 //}

	 @Override
	 public INBT serializeNBT()
	 {
		 
	 return TRANS_CAP.getStorage().writeNBT(TRANS_CAP, this.instance, null);
	 
	 }

	 @Override
	 public void deserializeNBT(INBT nbt)
	 {
		 
	 TRANS_CAP.getStorage().readNBT(TRANS_CAP, this.instance, null, nbt);
	 
	 }





	 
}
