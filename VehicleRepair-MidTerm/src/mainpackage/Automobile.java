package mainpackage;

public class Automobile extends LandVehicle {

	
	public Automobile() {
	}
	
	public Automobile(int numberOfTires) {
		setNumberOfTires(numberOfTires);
	}

	
	@Override
	protected String getRepairChoices() {
		return "1: replace tires\n2: replace carburator\n3: paint job";
	}

	@Override
	public double doRepair(int chooseRepair) {
		double repairTime = 0;
		if (chooseRepair == 1) {
			// replace tires
			repairTime = getRepairTime(1);
			PartsAndSupplies.getItem("4 tires");
			PartsAndSupplies.getItem("20 lugnuts");
			PartsAndSupplies.getItem("24 liters compressed air");
			System.out.println("replaceing tires");
		}
		return repairTime;
	}

	public double getRepairTime(int repairChoiceNumber) {
		double repairTime = 0;
		if (repairChoiceNumber == 1) {
			repairTime = 3.75;
		}
		return repairTime;
	}

}



