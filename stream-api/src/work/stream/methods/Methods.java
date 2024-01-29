package work.stream.methods;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		
		//filter(Predicate)
			//predicate - boolean valued function
			//e -> { return true/false }
		
		//map(Function)
			//operation on each element
			//return element
		
		//collect
		//forEach(consumer) -- forEach will consume element 1 by 1 
		//sorted()
		//min()
		
		List<String> names = List.of("Durgesh", "Aman", "Abhilekh", "Manoj", "Ankit");
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> numbers = List.of(25, 5, 7, 9, 3, 13);
		List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		names.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("-------------------");
		newNames.stream().forEach(System.out::println);//Function Reference
		
		//sorted
		System.out.println("---------Ascending Order----------");
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("---------Descending Order----------");
		numbers.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
		
		//min()
		System.out.println("-------------------");
		Integer minNumber = numbers.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("min: "+minNumber);
		
		Integer maxNumber = numbers.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("max: "+maxNumber);
	}
}
