package bakery4_added_ui_pie;

public class Pie extends Job {

	public Pie(int cTime) {
		super(cTime);
	}
	
	public Pie(int cTime, boolean isTemp) {
		super(cTime);
	}

	public String getIngrediants() {
		return "sugar + fruit";
	}

	public String getJobType() {
		return "Pie";
	}

	@Override
	public String toString() {
		return getThisOrderNumber() + "\tPie\t" + getCookingTime();
	}
}
