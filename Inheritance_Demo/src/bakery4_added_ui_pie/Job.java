package bakery4_added_ui_pie;

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
	
	@Override
	public String toString() {
		return "num:" + String.valueOf(thisOrderNum) + "-time:" + getCookingTime();
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

	public void setThisOrderNum() {
		this.thisOrderNum = orderNum;
	}
}
