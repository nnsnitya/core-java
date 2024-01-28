package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starts..");
		
		/*MyInterface myInterface = new MyInterfaceImpl();
		myInterface.sayHello();*/
		
		MyInterface myInter = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("This is first anonymous class");
			}
		};
		myInter.sayHello();
		
		MyInterface myInter2 = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("This is second anonymous class");
			}
		};
		myInter2.sayHello();
		
	}

}
