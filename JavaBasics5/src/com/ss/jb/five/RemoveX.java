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
 * Given a list of strings
 * returns a list where each string has all its "x" removed
 *
 */
public class RemoveX {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("xxax", "xbxbx", "xxcx");

		System.out.println(noX(items));
	}
	
	public static List<String> noX(List<String> itemz){
		
		return itemz.stream().map(i -> i.replace("x", "")).collect(Collectors.toList());
		
	}

}
