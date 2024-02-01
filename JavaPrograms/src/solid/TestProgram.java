package solid;

public class TestProgram {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		calculateArea(circle);
		print(circle);
		
	}
	
	private static void calculateArea(Circle circle) {
		double area = Math.PI * circle.getRadius() * circle.getRadius();
		System.out.println("Area is: "+area);
	}

	private static void print(Circle circle) {
		System.out.println(circle);
	}
}
