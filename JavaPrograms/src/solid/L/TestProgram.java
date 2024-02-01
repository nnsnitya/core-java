package solid.L;

public class TestProgram {

	public static void main(String[] args) {

		IShape circle = new Circle(5);
		IShape rect = new Rectangle(4, 5);
		IShape square = new Square(5, 5);
		
		calculateArea(circle);
		calculateArea(rect);
		calculateArea(square);
		Printer p = new Printer();
		p.print(circle);
		p.print(rect);
		p.print(square);
		
	}
	
	private static void calculateArea(IShape iShape) {
		System.out.println("Area is: "+iShape.getArea());
	}
}
