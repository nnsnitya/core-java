package interviewcoding.inheritance;

class A {
	int i = 10;
	public void print() {
		System.out.println("This is A");
	}
}

class B extends A {
	int i = 20;
	public void print() {
		System.out.println("This is B");
	}
}

public class Test {

	public static void main(String[] args) {

		B a = new B();
		System.out.println(a.i);
		a.print();
	}

}
