package ic.nab.countingelements;

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
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/
