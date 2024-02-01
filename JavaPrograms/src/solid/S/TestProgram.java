package solid.S;

public class TestProgram {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		calculateArea(circle);
		new Printer().print(circle);
		
	}
	
	private static void calculateArea(Circle circle) {
		System.out.println("Area is: "+circle.getArea());
	}

}
