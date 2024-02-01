package interviewcoding.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		
		List<String> names = List.of("Durgesh", "Aman", "Abhilekh", "Manoj", "Ankit");
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> numbers = List.of(25, 5, 7, 10, 9, 3, 13, 3, 4, 3,5);
		List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(i -> i%2 == 1));
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));
		System.out.println("-------------------");
		
		List<Integer> distinctList = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		//"Nityanand".chars().mapToObj(null)
	}
}
