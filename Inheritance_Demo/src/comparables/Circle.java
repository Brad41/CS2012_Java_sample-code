package comparables;

public class Circle extends Shape implements Comparable {

	public int radius = 0;

	public Circle(int aRadius) {
		radius = aRadius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14159;
	}

	@Override
	public int compareTo(Object arg0) {
		if( this.getArea() == ( (Shape)arg0).getArea() ) {
			return 0;
		} else if(this.getArea() > ( (Shape)arg0).getArea()) {
			return 1;
		} else {
			return -1;
		}
	}

}

//
//public double getArea() {
//	return radius * radius * 3.14159;
//}
//
//@Override
//public String toString() {
//	return String.valueOf(getArea());
//}
//
//@Override
//public int compareTo(Object arg0) {
//	Shape test = (Shape) arg0;
//	int value = 0;
//	if(this.getArea() == test.getArea()) {
//		return 0;
//	} else if(this.getArea() > test.getArea()) {
//		return 1;
//	} else {
//		return -1;
//	}	
//}