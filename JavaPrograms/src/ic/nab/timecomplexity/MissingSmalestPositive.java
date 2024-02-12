package ic.nab.timecomplexity;

import java.util.HashSet;
import java.util.Set;

public class MissingSmalestPositive {

	public static void main(String[] args) {

		// Example usage
        int[] myArray = {-1, -3}; // Assuming 4 is the smallest missing positive integer
        int result = findSmallestMissingPositive(myArray);
        System.out.println("The smallest missing positive integer is: " + result);
		
	}

	private static int findSmallestMissingPositive(int[] myArray) {
		Set<Integer> mySet = new HashSet<>();

        // Add positive integers to the set
        for (int num : myArray) {
            if (num > 0) {
            	mySet.add(num);
            }
        }

        // Find the smallest missing positive integer
        int smallestMissing = 1;
        while (mySet.contains(smallestMissing)) {
            smallestMissing++;
        }

        return smallestMissing;
	}

}

/*

An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].

 */
