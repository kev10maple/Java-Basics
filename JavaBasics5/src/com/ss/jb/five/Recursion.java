/**
 * 
 */
package com.ss.jb.five;

/**
 * @author Kevin
 *
 */
public class Recursion {

	public static void main(String[] args) {
		
		//int[] array = {1, 2, 4, 8, 1};
		int[] array = {2, 4, 4, 8};
		
		System.out.println(groupSumClump(0, array, 14));

	}
	
	public static boolean groupSumClump(int start, int[] arr, int target) {
		
		//base case
		if(start >= arr.length)
			return target == 0;
		
		int sum = arr[start];
		int counter = 1;
		
		for(int i = start + 1; i < arr.length; i++) {
			
			if(arr[i] == arr[start]) {
				sum += arr[i];
				counter++;
			}

		}
		
		return groupSumClump(start + counter, arr, target-sum) || groupSumClump(start + counter, arr, target);
		
	}

}
