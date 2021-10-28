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
 * Given a list of integers
 * returns a list where each integer is multiplied by 2
 *
 */
public class Doubled {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(6, 8, 6, 8, -1);
		
		System.out.println(timestwo(items));
	}
	
	public static List<Integer> timestwo(List<Integer> itemz){
		
		return itemz.stream().map(i -> i * 2).collect(Collectors.toList());
		
	}

}
