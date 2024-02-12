package ic.nab.arrays;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {0,0,0};
		int[] arr3 = {1,2,3,4};
		int k = 4;

		System.out.println(Arrays.toString(rotateArrayRight(arr1, k)));
		System.out.println(Arrays.toString(rotateArrayRight(arr2, k)));
		System.out.println(Arrays.toString(rotateArrayRight(arr3, k)));
	}

	private static int[] rotateArrayRight(int[] arr, int k) {
		int length = arr.length;
		// Handle the case where k is greater than the array length
		k = k % length;
		
        if (arr == null || arr.length <= 1 || k == 0) {
            // No need to rotate if the array is empty or has only one element
            return arr;
        }
        
        while(k > 0) {
        	int lastElement = arr[arr.length - 1];
        	
        	//shift element to the right
        	for(int i = arr.length-1; i>0; i--) {
        		arr[i] = arr[i-1];
        	}
        	arr[0] = lastElement;
        	System.out.println(Arrays.toString(arr));
        	k--;
        }
        return arr;
	}

}

/*
 An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
