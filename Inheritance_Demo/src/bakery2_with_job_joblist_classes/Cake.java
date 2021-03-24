package bakery2_with_job_joblist_classes;

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
