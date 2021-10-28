/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kevin
 *
 * Returns a comma separated string
 * Should be preceded by letter 'e' if number is even
 * Preceded by letter 'o' if number is odd
 */
public class CommaSeparatedString {

	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(1, 5, 18, 93, 152);
		
		StringBuilder s = new StringBuilder("");
		
		for(Integer i : items) {
			
			if(i % 2 == 0) {
				s.append("e" + i.toString() + ", ");
				
			}
			
			else {
				s.append("o" + i.toString() + ", ");
				
			}
			
			System.out.println(s.toString());
		}
		
		
		
		

	}

}
