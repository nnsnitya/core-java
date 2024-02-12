package ic.j8.stream.problem;

import java.util.Arrays;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 123945;
		int sum = sumOfDigits(num);
		System.out.println("Sum of digits in "+num+" is: "+sum);
	}

	//using java8
	private static int sumOfDigits2(int number) {
		
		return Arrays.stream(String.valueOf(number).split(""))
		.mapToInt(Integer::parseInt)
		.sum();
		
	}

	//Traditional
	private static int sumOfDigits(int number) {
		int sum = 0;
		
		// Ensure the number is non-negative
		number = Math.abs(number);
		
		while(number > 0) {
			int digit = number % 10;
			number = number / 10;
			sum += digit;
		}
		
		
		return sum;
	}
}
