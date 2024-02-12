package ic.nab.countingelements;

import java.util.HashSet;
import java.util.Set;

public class CheckPermutation {

	public static int isPermutation(int[] A) {
        int N = A.length;
        Set<Integer> uniqueElements = new HashSet<>();

        // Check for duplicate elements
        for (int num : A) {
        	System.out.println(num);
            if (num < 1 || num > N || !uniqueElements.add(num)) {
            	System.out.println("duplicate");
                return 0; // Not a permutation
            }
        }

        // Check if all elements from 1 to N are present -- unnecessary code
        /*for (int i = 1; i <= N; i++) {
        	System.out.println(i);
            if (!uniqueElements.contains(i)) {//not reachable code due to line 15
            	System.out.println("sequence not completed");
                return 0; // Not a permutation
            }
        }*/

        return 1; // It's a permutation
    }

    public static void main(String[] args) {
        // Example usage:
        int[] permutationArray = {4, 3, 1, 2};
        int result = isPermutation(permutationArray);

        if (result == 1) {
            System.out.println("The array is a permutation.");
        } else {
            System.out.println("The array is not a permutation.");
        }
    }
}

/*
 A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
 
 
*/
