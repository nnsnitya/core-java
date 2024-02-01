package solid.O;

public class TestProgram {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		Rectangle rect = new Rectangle(4, 5);
		
		calculateArea(circle);
		calculateArea(rect);
		Printer p = new Printer();
		p.print(circle);
		p.print(rect);
		
	}
	
	private static void calculateArea(Circle circle) {
		System.out.println("Area is: "+circle.getArea());
	}
	private static void calculateArea(Rectangle	rect) {
		System.out.println("Area is: "+rect.getArea());
	}
}
