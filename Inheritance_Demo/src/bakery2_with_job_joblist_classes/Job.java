package bakery2_with_job_joblist_classes;

public abstract class Job {

	private int cookingTime = 0;
	private boolean finished = false;
	
	public int getCookingTime() {
		return cookingTime;
	}
	
	public void setCookingTime(int newTime) {
		cookingTime = newTime;
	}
	
	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
}
