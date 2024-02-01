package solid.D;

public class TestProgram {

	public static void main(String[] args) {

		I2DShape circle = new Circle(5);
		I2DShape rect = new Rectangle(4, 5);
		I2DShape square = new Square(5);
		I3DShape cube = new Cube(5);
		
		
		calculateArea(circle);
		calculateArea(rect);
		calculateArea(square);
		calculateVolume(cube);
		Printer p = new Printer();
		p.print(circle);
		p.print(rect);
		p.print(square);
		p.print(cube);
		
	}
	
	private static void calculateArea(I2DShape iShape) {
		System.out.println("Area is: "+iShape.getArea());
	}
	private static void calculateVolume(I3DShape iShape) {
		System.out.println("Area is: "+iShape.getVolume());
	}
}
