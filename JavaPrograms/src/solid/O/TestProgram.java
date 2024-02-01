package solid.O;

public class TestProgram {

	public static void main(String[] args) {

		IShape circle = new Circle(5);
		IShape rect = new Rectangle(4, 5);
		
		calculateArea(circle);
		calculateArea(rect);
		Printer p = new Printer();
		p.print(circle);
		p.print(rect);
		
	}
	
	private static void calculateArea(IShape iShape) {
		System.out.println("Area is: "+iShape.getArea());
	}
}
