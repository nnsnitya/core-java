package dp.creational.singleton;

public class TestProgram {

	public static void main(String[] args) {
		
		DataSource1 dSource1_1 = DataSource1.getDataSource1();
		DataSource1 dSource1_2 = DataSource1.getDataSource1();
		System.out.println(dSource1_1.hashCode());
		System.out.println(dSource1_2.hashCode());
		
		DataSource2 dSource2_1 = DataSource2.getDataSource2();
		DataSource2 dSource2_2 = DataSource2.getDataSource2();
		System.out.println(dSource2_1.hashCode());
		System.out.println(dSource2_2.hashCode());
		
		
	}
}
