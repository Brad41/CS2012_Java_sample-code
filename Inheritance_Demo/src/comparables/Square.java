package comparables;

public class Square extends Shape implements Comparable {

	public int side = 0;
	
	public Square(int aSide) {
		side = aSide;
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

	@Override
	public double getArea() {
		return side * side;
	}


}

















//
//public double getArea() {
//	return side * side;
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