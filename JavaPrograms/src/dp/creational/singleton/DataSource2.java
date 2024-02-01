package dp.creational.singleton;

public class DataSource2 {
	
	//Eager way of creating singleton obj
	private static DataSource2 dSource2 = new DataSource2();
	
	//constructor
	private DataSource2() {
		
	}
	
	public static DataSource2 getDataSource2() {
		return dSource2;
	}
}
