package ic.oops.polymorphism.runtime;

public class Main {

	public static void main(String[] args) {
		System.out.println("this is just testing");
		Person person1 = new Person();
		person1.showDetail();

		Person person2 = new Emp();
		person2.showDetail();
		System.out.println("------------------");
		
		Ram ram = new Ram();
		ram.doWork(person1);
		ram.doWork(person2);//No need to change Ram class, only need to pass the object
	}
}
