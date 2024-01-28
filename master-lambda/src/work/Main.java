package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starts..");
		
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.sayHello();
		
	}

}
