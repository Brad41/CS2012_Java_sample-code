package abstractFruit_demo;

import java.util.ArrayList;

public class AbstractFruit_TestRunner {

	public static void main(String[] args) {
		System.out.println("AbstractFruit_TestRunner");
		
		Object o = new Object();
		o.toString();
		
		Fruit fa;
		//System.out.println(f.name);
		
		Fruit.checkMood();
		
		ArrayList<Fruit> arrf = new ArrayList<>();
		
		Apple a = new RedFuji();
		System.out.println(a.getName());
		System.out.println(a.doConsume());

		
		// Number n = new Number(); // can not, because Number class is abstract
		Number n = Integer.valueOf(42);
		System.out.println(n.getClass());
		
		System.out.println(a.getWhoAmI());
		
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