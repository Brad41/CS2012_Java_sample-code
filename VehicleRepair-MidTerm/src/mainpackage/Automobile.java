package mainpackage;

public class Automobile extends LandVehicle {

	public Automobile() {
	}

	public String getRepairChoices() {
		return "1: replace tires\n2: replace carburator\n3: paint job";
	}
	
	
	@Override
	protected double doRepair(int chooseRepair) {
		double repairTime = 0;
		if(chooseRepair == 1) {
			// replace tires
			repairTime = getRepairTime(1); 
			RepairStockUsed.getItem("4 tires");
			RepairStockUsed.getItem("20 lugnuts");
			RepairStockUsed.getItem("24 liters compressed air");
			System.out.println("replaceing tires");
		}
		return repairTime;
	}
	
	public double getRepairTime(int repairChoiceNumber) {
	double repairTime = 0;
	if(repairChoiceNumber == 1) {
		repairTime = 3.75;
	}
	return repairTime;
}
	
}





















//
//public Automobile(int numberOfTires) {
//	setNumberOfTires(numberOfTires);
//}
//
//@Override
//protected String listRepairChoices() {		
//	return "1: Replace tires\n2: replace Carburator\n3: Change Oil";
//}
//
//public double getRepairTime(int repairChoiceNumber) {
//	double repairTime = 0;
//	if(repairChoiceNumber == 1) {
//		repairTime = 1.75;
//	}
//	return repairTime;
//}
//
//@Override
//protected double doRepair(int repairType) {
//	double repairTime = 0;
//	if(repairType == 1) {
//		RepairStockUsed.getItem("4 tires");
//		RepairStockUsed.getItem("20 lugnuts");
//		RepairStockUsed.getItem("24 liters compressed air");
//		repairTime = getRepairTime(1);
//	} else if (repairType == 2) {
//		repairTime = 0;
//	}
//	
//	return repairTime;
//}
