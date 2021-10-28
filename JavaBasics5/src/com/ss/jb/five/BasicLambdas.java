/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Kevin
 * 
 * Make an array containing a few Strings.
 * Sort it by :
 * Length (shortest to longest)
 * Reverse Length (longest to shortest)
 * Alphabetically by the first character only
 * String that contains "e" first, everything else second
 * Redo previous problem but use static helper method
 */
public class BasicLambdas {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("Apple", "Banana", "Orange", "Eggplant", "Cucumber");

		//sort shortest to longest
		System.out.println("Sorted by length: ");
		
		Collections.sort(items, (a, b) -> (a.length() - b.length()));
		for(String s : items) {
			System.out.println(s);
		}
		
		//sort by longest to shortest
		System.out.println("Sorted by reverse length: ");
		
		Collections.sort(items, (a, b) -> (b.length() - a.length()));
		for(String s : items) {
			System.out.println(s);
		}
		
		//sort alphabetically by first character
		System.out.println("Sorted Alphabetically: ");
		
		Collections.sort(items, (a, b) -> (a.charAt(0) - b.charAt(0)));
		for(String s : items) {
			System.out.println(s);
		}
		
		//sort by string that contains 'e' first (only checking lowercase)
		System.out.println("Sorted by strings that contain e first: ");
		
		Collections.sort(items, (a, b) -> {
			if(a.contains("e")) 
				return -1;
			if(b.contains("e")) 
				return 1;
			if(a.contains("e") && b.contains("e")) 
				return 0;
			else
				return 0;
		});
		for(String s : items) {
			System.out.println(s);
		}
		
		//sort by string that contains 'e' first with static method (only checking lowercase)
		System.out.println("Sorted by strings that contain e first with static method");
		
		Collections.sort(items, (a, b) -> ESort(a, b));
		for(String s : items) {
			System.out.println(s);
		}
		
		
	}
	
	public static Integer ESort(String a, String b) {
		
		if(a.contains("e")) 
			return -1;
		if(b.contains("e")) 
			return 1;
		if(a.contains("e") && b.contains("e")) 
			return 0;
		else
			return 0;
		
	}

}
