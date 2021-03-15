package abstractFruit_demo;

public class AbstractFruit_TestRunner {

	public static void main(String[] args) {
		System.out.println("AbstractFruit_TestRunner");
		
		//Fruit f = new Fruit();
		//System.out.println(f.getColor());
		
		
		Apple a = new Apple();
		System.out.println(a.makePie());
		System.out.println(a.getColor());
		System.out.println(a.howToCook());
	}

}
