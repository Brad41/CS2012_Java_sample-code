package comparables;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_main {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(5);
		
		Square s1 = new Square(2);
		Square s2 = new Square(3);
	
		
//		System.out.println( c1.compareTo(c2) );
//		System.out.println( c1.compareTo(s2) );
//		System.out.println( s1.compareTo(c2) );
		
		
		ArrayList shapes = new ArrayList();
		
		shapes.add(s1);
		shapes.add(c2);
		shapes.add(s2);
		shapes.add(c1);
		
		System.out.println(shapes);
		
		Collections.sort(shapes);
	
		System.out.println(shapes);
		
	}
}
