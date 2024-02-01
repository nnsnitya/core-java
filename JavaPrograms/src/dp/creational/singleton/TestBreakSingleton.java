package dp.creational.singleton;

import java.lang.reflect.Constructor;

public class TestBreakSingleton {

	public static void main(String[] args) throws Exception {
	
		/*
		 *1. Reflection API to break singleton pattern
		 *	solution 1: if obj already exist ==> throws exception from inside constructor
		 *	solution 2: use enum 
		 * 
		 * 
		 * 
		 * 
		 */
		DataSource1 dSource1 = DataSource1.getDataSource1();
		System.out.println(dSource1.hashCode());
		
		//to use reflection API, need to load DataSource1 class
		Constructor<DataSource1> constructor = DataSource1.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		DataSource1 dSource2 = constructor.newInstance();
		System.out.println(dSource2.hashCode());
	}
}
