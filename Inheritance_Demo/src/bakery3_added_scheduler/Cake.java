package bakery3_added_scheduler;

public class Cake extends Job{
	
	public Cake(int cTime) {
		incrementOrderNum();
		setThisOrderNum();
		setCookingTime(cTime);
		setFinished(false);
	}
	
	public String getIngrediants() {
		return "sugar";
	}
	
}
