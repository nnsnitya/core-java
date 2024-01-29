package work.streamobj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		//Stream API - processsing collection/ group of Objects
		
		//1st way. blank stream obj
		Stream<Object> emptyStream = Stream.empty();
		emptyStream.forEach(e -> {
			System.out.println(e);
		});
		
		//2nd way. array, object
		String names[] = {"Nitya", "prem", "Manoj", "Abhilekh"};
		Stream<String> stream1 = Stream.of(names);
		
		stream1.forEach(e -> {
			System.out.println(e);
		});
		
		//3rd way. builder pattern
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4th way
		IntStream stream = Arrays.stream(new int[] {2, 5, 7, 21,3, 24, 67});
		stream.forEach(e -> {
			System.out.println(e);
		});
		
		//5th way. List, Set
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(55);
		list2.add(3);
		list2.add(32);
		list2.add(43);
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e -> {
			System.out.println(e);
		});
		
		
	}

}
