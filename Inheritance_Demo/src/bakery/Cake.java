package bakery;

public class Cake {
	
	public int cookingTime = 0;
	
	public static int orderNum = 0;
	
	public int thisOrderNum = 0;
	
	public Cake(int cTime) {
		orderNum++;
		thisOrderNum = orderNum;
		cookingTime = cTime;
	}
	
	
	@Override
	public String toString() {
		return "num:" + String.valueOf(thisOrderNum) + "-time:" + cookingTime;
	}
}
