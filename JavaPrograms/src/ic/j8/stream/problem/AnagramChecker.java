package ic.j8.stream.problem;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramChecker {
	public static void main(String[] args) {
		
		String s1 = "Race Car";
        String s2 = "CarRace";
        
        System.out.println("Logic1=> Strings are anagram: "+areAnagrams1(s1, s2));
        System.out.println("Logic2=> Strings are anagram: "+areAnagrams2(s1, s2));
        
	}
	
	//Logic 1
	private static boolean areAnagrams1(String str1, String str2) {
		boolean anagram = false;
        str1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()).replaceAll("\\s","");
        str2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()).replaceAll("\\s","");
        
        if(str1.equals(str2)) {
        	anagram = true;
        }
		return anagram;
	}
	
	//Logic 2
	private static boolean areAnagrams2(String str1, String str2) {
		boolean anagram = false;
		str1 = str1.replaceAll("\\s", "").toUpperCase();
		str2 = str2.replaceAll("\\s", "").toUpperCase();

		//check if length are different
		if(str1.length() != str2.length())
			return anagram;
		
		//convert string to char array and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			anagram = true;
		}
		
		return anagram;
	}
}
