package ic.dm;

public interface Shape {
	double calculateArea();
	
	double calculatePerimeter();
	
	default String getDescription() {
		return "This is a shape";
	}
	
	default void displayInfo() {
		System.out.println("Shape: "+ getDescription());
		System.out.println("Area: "+ calculateArea());
		System.out.println("Perimeter: "+ calculatePerimeter());
	}
}

