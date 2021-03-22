package mainpackage;

public class BarbieDreamCar extends LandVehicle {

	
	
	@Override
	protected String getRepairChoices() {
		// TODO Auto-generated method stub
		return "1: Fix Ken Ejector seat\n2: ";
	}

	@Override
	protected double doRepair(int selectRepair) {
		double repairTime = 0;
		if(selectRepair == 1) {
			repairTime = getRepairTime(1);
			PartsAndSupplies.getItem("4 high powered springs");
			PartsAndSupplies.getItem("replace upholster pads");
			PartsAndSupplies.getItem("lubricate bearings");
			PartsAndSupplies.getItem("4 ml bering oil");
			System.out.println("repaired ejector seat");  //debug
		}
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRepairTime(int repairChoiceNumber) {
		double repairTime = 0;
		if (repairChoiceNumber == 1) {
			repairTime = 7.5;
		}
		return repairTime;
	}
	
}
