package solid.D;

public class Cube implements I3DShape {

	private double side;
	
	public Cube(double side) {
		super();
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getVolume() {
		return side * side * side;
	}

	@Override
	public String toString() {
		return "Cube [side=" + side + "]";
	}

}
