package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Q) Create a list and filter all even numbers from list
		
		List<Integer> list1 = List.of(2,4, 50, 55, 33, 12, 17);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(26);
		list2.add(57);
		list2.add(72);
		
		List<Integer> list3 = Arrays.asList(23, 11, 37, 12, 99, 38);
		
		//list1
		//without stream
		List<Integer> listEven = new ArrayList<>();
		for(Integer i:list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(listEven);
		
	}

}
