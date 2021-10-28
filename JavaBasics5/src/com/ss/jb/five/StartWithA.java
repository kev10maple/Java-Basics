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
 *
 * Given list of Strings,
 * A method that returns a list of all strings that start with 
 * the letter 'a' (lower case) and have exactly 3 letters
 */
public class StartWithA {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("aaa", "bab", "aabb", "abb", "ababa");

		List<String> toList = items.stream().filter(s -> s.length() == 3 && s.charAt(0) == 'a').collect(Collectors.toList());
		
		System.out.println((toList));
	}

}
