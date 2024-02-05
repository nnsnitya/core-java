package interviewcoding.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Methods {
	public static void main(String[] args) {
		
		List<String> names = List.of("Durgesh", "Aman", "Abhilekh", "Durgesh", "Manoj", "Ankit");
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> numbers = List.of(25, 5, 7, 10, 9, 3, 13, 3, 4, 11,5);
		List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		System.out.println("---------Seperate Odd & Even Numbers----------");
		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(i -> i%2 == 1));
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));
		
		System.out.println("---------Print Number multiplies of----------");
		numbers.stream().filter(n -> n % 5 == 0).forEach(System.out::println);
		
		System.out.println("---------Max & Min----------");
		System.out.println("Max: "+numbers.stream().max(Comparator.naturalOrder()).get());
		System.out.println("Max: "+numbers.stream().max((x,y) -> x.compareTo(y)));
		
		System.out.println("Min: "+numbers.stream().min(Comparator.naturalOrder()).get());
		System.out.println("Min: "+numbers.stream().min((x,y) -> x.compareTo(y)));
		
		System.out.println("---------Print Distinct List----------");
		List<Integer> distinctList = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		System.out.println("---------Limit 3 Max & Min----------");
		numbers.stream().sorted().limit(3).forEach(System.out::println);
		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		System.out.println("---------Merge 2 arrays to Sorted Array----------");
		int[] a = new int[] {4, 2, 7, 1, 3};
		int[] b = new int[] {8, 3, 9, 5, 1};
		int[] sortedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println("Sorted Array: "+Arrays.toString(sortedArray));

		int[] distinctSortedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
		System.out.println("Distinct Sorted Array: "+Arrays.toString(distinctSortedArray));

		
		
		System.out.println("---------Frequency of each element in An Array----------");
		Map<String, Long> frqOfStrList_map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		/*frqOfStrList_map.entrySet().stream().forEach(e -> {
			System.out.println("Key: "+e.getKey());
			System.out.println("Value: "+e.getValue());
			System.out.println("-------------------");
		});*/
		System.out.println(frqOfStrList_map);

		System.out.println("---------Frequency of each element in A String----------");
		String str = "Abhilekh";
		Map<Character, Long> frqOfStr_map = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		/*frqOfStr_map.entrySet().stream().forEach(entry -> {
			System.out.println("Key -> "+entry.getKey());
			System.out.println("Value->"+entry.getValue());
			System.out.println("-------------------");
		});*/
		System.out.println(frqOfStr_map);
		
		
		System.out.println("---------Joining List of Strings----------");
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString = listOfStrings.stream().collect(Collectors.joining("--","[","]"));
		System.out.println(joinedString);
	}
}
