/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kevin
 * 
 * Given a list of non-negative integers
 * return an integer list of the rightmost digits (use %)
 *
 */
public class RightMost {

	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(16, 8, 886, 8, 1);
		
		System.out.println(rightMost(items));
	}
	
	public static List<Integer> rightMost(List<Integer> itemz){
		return itemz.stream().map(i -> i % 10).collect(Collectors.toList());
	}

}
