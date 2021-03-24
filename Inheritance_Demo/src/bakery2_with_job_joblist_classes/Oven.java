package bakery2_with_job_joblist_classes;

public class Oven {

	private int timeRemaining = 20;
	
	public Oven() {
	}
	
	public void resetTime() {
		timeRemaining = 20;
	}
	
	
	public int useTime(int timeUsed) {
		if(timeRemaining - timeUsed < 0) {
			int tempTime = timeRemaining;
			timeRemaining = 0;
			return tempTime - timeUsed;
		} else {
			timeRemaining = timeRemaining - timeUsed;
			return 0;
		}
		
		
	}
}
