package ic.dm;

public class MainTest {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4, 5);
		Circle circle = new Circle(5);
		
		System.out.println(rectangle.getDescription());
		rectangle.displayInfo();
		System.out.println("---------");
		circle.displayInfo();
		
	}

}
//Normal use of Default Method