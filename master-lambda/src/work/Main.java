package work;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starts..");
		
		/*MyInterface myInterface = new MyInterfaceImpl();
		myInterface.sayHello();*/
		
		/*MyInterface myInter = new MyInterface() {
			
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
		myInter2.sayHello();*/
		
		//using our interface with the help of lambda
		MyInterface i = () -> System.out.println("this is first time, I am using lambda");
		i.sayHello();
		MyInterface i2 = () -> System.out.println("this is second time, I am using lambda");
		i2.sayHello();
		
		/*SumInterface sumInterface = (int a, int b) -> {
			return a+b;
		};*/
		SumInterface sumInterface = (a, b) -> a + b;
		
		System.out.println(sumInterface.sum(21, 4));
		System.out.println(sumInterface.sum(45, 32));
		
		LengthInter lengthInter = str -> str.length();
		System.out.println("Length of String: "+lengthInter.getLength("Nityanand Singh"));
	}

}
