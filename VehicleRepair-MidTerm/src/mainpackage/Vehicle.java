package mainpackage;

public abstract class Vehicle {
	
	protected int IDnumber;
	protected int numberOfTires = 0;
	
	public int getID() {
		return IDnumber;
	}
		
	public int getNumberOfTires() {
		return numberOfTires;
	}
	
	public void setNumberOfTires(int numTires) {
		numberOfTires = numTires;
	}
	
	protected abstract String getRepairChoices();
	
	protected abstract double doRepair(int selectRepair);
	
}





