package abstractFruit_demo;

public class AbstractFruit_TestRunner {

	public static void main(String[] args) {
		System.out.println("AbstractFruit_TestRunner");
		
		Object o = new Object();
		o.toString();
		
		Fruit f = new Fruit();
		//System.out.println(f.name);
		
		Apple a = new Apple();
		System.out.println(a.getName());
		
	}

}


























//
////Fruit f = new Fruit();
////System.out.println(f.getColor());
//
//Fruit af = new Apple();
//Fruit rff = new RedFuji();
//
//Apple a = new Apple();
//System.out.println(a.makePie());
//System.out.println(a.getColor());
//System.out.println(a.howToCook());