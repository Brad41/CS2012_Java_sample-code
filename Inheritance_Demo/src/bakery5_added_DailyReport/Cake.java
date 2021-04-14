package bakery5_added_DailyReport;

public class Cake extends Job {
	
	public Cake(int cTime) {
		super(cTime);
	}
	
	public Cake(int cTime, boolean isTemp) {
		super(cTime);
	}
	
	public String getIngrediants() {
		return "sugar";
	}
	
	public String getJobType() {
		return "Cake";
	}
	
	@Override
	public String toString() {
		return getThisOrderNumber() + "\tCake\t" +  getCookingTime();
	}
}
