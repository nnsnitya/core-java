package solid.D;

public class Circle implements I2DShape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
