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
