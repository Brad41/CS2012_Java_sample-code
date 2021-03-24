package bakery2_with_job_joblist_classes;

public class Cake extends Job{
	
	public static int orderNum = 0;
	public int thisOrderNum = 0;
	
	
	public Cake(int cTime) {
		orderNum++;
		thisOrderNum = orderNum;
		setCookingTime(cTime);
		setFinished(false);
	}
	
	
	
	@Override
	public String toString() {
		return "num:" + String.valueOf(thisOrderNum) + "-time:" + getCookingTime();
	}


}
