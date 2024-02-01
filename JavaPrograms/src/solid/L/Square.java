package solid.L;

public class Square implements IShape {

	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side ;
	}
	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
