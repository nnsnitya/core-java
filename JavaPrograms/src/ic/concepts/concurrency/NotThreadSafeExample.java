package ic.concepts.concurrency;

import java.util.ArrayList;
import java.util.List;

public class NotThreadSafeExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		list.add("First");
		list.add("First");
		list.add("First");
		list.add("First");
		
		
		Runnable t1 = () -> {
			//thread1 task
			for(String str: list) {
				System.out.println(str);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable t2 = () -> {
			//thread2 task
			list.add("new item1");
			list.add("new item2");
			list.add("new item3");
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
	}

}
