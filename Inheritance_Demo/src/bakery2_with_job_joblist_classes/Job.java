package bakery2_with_job_joblist_classes;

public abstract class Job {
	
	private static int orderNum = 0;
	private int thisOrderNum = 0;

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

	public static void incrementOrderNum() {
		orderNum++;
	}

	public static void setOrderNum(int orderNum) {
		Job.orderNum = orderNum;
	}

	public int getThisOrderNum() {
		return thisOrderNum;
	}

	protected void setThisOrderNum() {
		this.thisOrderNum = orderNum;
	}
	
	@Override
	public String toString() {
		return "num:" + String.valueOf(thisOrderNum) + "-time:" + getCookingTime();
	}
	  
}
