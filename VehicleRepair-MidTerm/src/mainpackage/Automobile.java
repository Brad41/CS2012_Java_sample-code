package mainpackage;

public class Automobile extends Vehicle {

	public Automobile() {
	}
	
	public Automobile(int numberOfTires) {
		setNumberOfTires(numberOfTires);
	}
	
	@Override
	protected String listRepairChoices() {		
		return "1: Replace tires\n2: replace Carburator\n3: Change Oil";
	}

	public double getRepairTime(int repairChoiceNumber) {
		double repairTime = 0;
		if(repairChoiceNumber == 1) {
			repairTime = 1.75;
		}
		return repairTime;
	}
	
	@Override
	protected double doRepair(int repairType) {
		double repairTime = 0;
		if(repairType == 1) {
			RepairStockUsed.getItem("4 tires");
			RepairStockUsed.getItem("20 lugnuts");
			RepairStockUsed.getItem("24 liters compressed air");
			repairTime = getRepairTime(1);
		} else if (repairType == 2) {
			repairTime = 0;
		}
		
		return repairTime;
	}
	
	

}
