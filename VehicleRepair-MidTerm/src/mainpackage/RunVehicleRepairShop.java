package mainpackage;

public class RunVehicleRepairShop {

	public static void main(String[] args) {
		System.out.println("Welcome to Vehicle Repair Awsome System Management Tool");
		
		System.out.println("Enter Vehicles repair requests: ");
		
		Automobile camero = new Automobile(4);
		
		double timeToRepair = camero.doRepair(1);
		System.out.println(timeToRepair + " hours");
		
		//of day pricess
		RepairStockUsed.createRestockOrderFile();

	}

}
