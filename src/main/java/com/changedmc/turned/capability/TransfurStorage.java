package com.changedmc.turned.capability;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

public class TransfurStorage implements Capability.IStorage<ITransfur> 
{
	public INBT writeNBT(Capability<ITransfur> capability, ITransfur instance, Direction side) {
		CompoundNBT properties = new CompoundNBT();
		properties.putInt("Transfur", instance.getTransfur());
		return properties;
	  }
	  
	public void readNBT(Capability<ITransfur> capability, ITransfur instance, Direction side, INBT nbt) {
		CompoundNBT properties = (CompoundNBT)nbt;
		instance.transfurType(properties.getInt("Transfur"));
		    
		    
		    
	  }
	
}

