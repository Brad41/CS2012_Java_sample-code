package abstractFruit_demo;

public class Apple extends Fruit{
	//TemperateFruit
	
	private String whoAmI = "apple";
	
	public Apple() {
		super.name = "Apple";
	}

	@Override 
	public String doConsume() {
		return "yummy apple pie";
	}

	@Override
	public String getWhoAmI() {
		return whoAmI;
	}
	

	
}























//public Apple() {	
//	super.color = "red";
//}
//
//
//public String makePie(){
//	return "Apple Pie is ready";
//}
//
//public String howToCook() {
//	return "baked or stewed";
//}