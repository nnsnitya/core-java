package solid.L;

public class Square extends Rectangle {

	public Square(double length, double breadth) {
		super(length, breadth);
		
	}
	
	public double getArea() {
		return getLength() * getBreadth();
	}
	
}
