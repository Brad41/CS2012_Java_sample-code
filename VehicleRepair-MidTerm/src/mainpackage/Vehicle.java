package mainpackage;

public abstract class Vehicle {
	
	protected int IDnumber;
	
	public int getID() {
		return IDnumber;
	}

	protected abstract double doRepair(int selectRepair);
		

	
}
































//protected int numberOfTires = 0;
//
//public int getNumberOfTires() {
//	return numberOfTires;
//}
//
//public void setNumberOfTires(int numTires) {
//	numberOfTires = numTires;
//}
//
//protected abstract String listRepairChoices();
//
//protected abstract double doRepair(int repairType);
