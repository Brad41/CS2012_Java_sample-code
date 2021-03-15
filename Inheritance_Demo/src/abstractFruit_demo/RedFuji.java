package abstractFruit_demo;

public class RedFuji extends Fuji{
	
	private final String color = "Red";
	
	public int getZenValue() {
		return 14;
	}

	public String howToCook() {
		return "bar-b-que";
	}
}
