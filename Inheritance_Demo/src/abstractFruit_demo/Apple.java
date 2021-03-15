package abstractFruit_demo;

public class Apple extends Fruit{
	//TemperateFruit
	
	
	public Apple() {	
		super.color = "red";
	}
	
	
	public String makePie(){
		return "Apple Pie is ready";
	}
	
	public String howToCook() {
		return "baked or stewed";
	}
	
}
