package work.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		//First Thread----------public abstract void run(); method of Runnable, can remove public, abstract, void & run
		Runnable thread1 = () -> {
			//this is body of the thread
			//stuff
			for(int i=1; i<10;i++) {
				System.out.println("Thread1: Value of i is: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(thread1);
		t.setName("Mohan");
		t.start();
		
		//Second Thread---
		Runnable thread2 = () -> {
			try {
				for(int i=1; i<=10;i++) {
					System.out.println("Thread2: "+i*2);
					Thread.sleep(1500);
				}
				
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t2 = new Thread(thread2);
		t2.setName("Sohan");
		t2.start();
	}

}
