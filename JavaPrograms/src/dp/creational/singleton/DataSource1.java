package dp.creational.singleton;

public class DataSource1 {
	
	private static DataSource1 dSource1;
	
	//constructor
	private DataSource1() {
		
	}
	
	//Lazy way of creating singleton obj
	public synchronized static DataSource1 getDataSource1() {//by using method sysnchronization
		//object of this class
		if(dSource1 == null) {
			dSource1 = new DataSource1();
		}
		return dSource1;
	}
}

/*
Singleton class rules
1. constructor private
2. obj create with the help of method
3. create field to store obj is private

*/