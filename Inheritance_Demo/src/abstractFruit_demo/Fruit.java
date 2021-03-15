package abstractFruit_demo;

public abstract class Fruit extends Object {

	protected String color = "";
	protected String name;
	
	public Fruit() {
		name = "";
	}
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String howToCook();
	
}
