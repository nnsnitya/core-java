package polymorphism.compiletime;

public class Student {
	public void read() {
		System.out.println("Reading JAVA book");
	}
	
	public void read(String bookName) {
		System.out.println("Reading "+bookName+" book");
	}
}
