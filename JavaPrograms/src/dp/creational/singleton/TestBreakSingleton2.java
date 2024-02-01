package dp.creational.singleton;

import java.lang.reflect.Constructor;

public class TestBreakSingleton2 {

	public static void main(String[] args) throws Exception {
	
		/*
		 *1. Reflection API to break singleton pattern
		 *	solution 1: if obj already exist ==> throws exception from inside constructor
		 *	solution 2: use enum 
		 * 
		 * 
		 * 
		 */
		DataSource3 dSource3_1 = DataSource3.INSTANCE;
		System.out.println(dSource3_1.hashCode());
		dSource3_1.test();
		
		//to use reflection API, need to load DataSource1 class
		Constructor<DataSource3> constructor = DataSource3.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		DataSource3 dSource3_2 = constructor.newInstance();
		System.out.println(dSource3_2.hashCode());
	}
}
