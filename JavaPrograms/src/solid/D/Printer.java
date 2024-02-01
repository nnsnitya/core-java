package solid.D;

public class Printer implements IPrinter {
	
	public void print(IShape ishape) {
		System.out.println("from Printer Class: "+ishape);
	}
}
