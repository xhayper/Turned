package com.changedmc.turned.capability;

public class Transfur implements ITransfur
{
	
	private int transfur = 0;
	
	
	  //public void CapabilityTransfur() {
	     //this.transfurType = 0;
	     //this.isTransfurred = false;
	//}
	

	
	
	  @Override
	  public int getTransfur() {
		return this.transfur;
	}
	  @Override
	  public void transfurType(int type) {
		  this.transfur = type;
	}

		
		

	  
}
