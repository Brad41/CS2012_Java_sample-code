package comparables;

public abstract class Shape {

	public abstract double getArea();
	
	@Override
	public String toString() {
		return String.valueOf(getArea());
	}
	
}
