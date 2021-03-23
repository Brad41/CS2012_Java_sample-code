package interface_demo;

import java.util.ArrayList;

public class Interface_edible_demo_main {

	public static void main(String[] args) {

		Banana bab = new Banana();
		Apple a = new Apple();
		Jatropha jj = new Jatropha();
		
		
		System.out.println( bab.howToEat() );
		System.out.println(bab.color);
		
 
		
		ArrayList<Edible> eatableStuff = new ArrayList<>();
		eatableStuff.add(bab);
		eatableStuff.add(a);
		//eatableStuff.add(jj);
		
		
		ArrayList<Fruit> fruityStuff = new ArrayList<>();
		fruityStuff.add(bab);
		fruityStuff.add(a);
		fruityStuff.add(jj);
		
		
	}
}
