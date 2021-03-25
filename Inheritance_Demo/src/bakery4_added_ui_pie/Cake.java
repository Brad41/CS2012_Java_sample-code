package bakery4_added_ui_pie;

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
