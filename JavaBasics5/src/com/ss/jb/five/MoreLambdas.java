/**
 * 
 */
package com.ss.jb.five;

import java.util.Scanner;

/**
 * @author Kevin
 *
 *         isOdd(): Must return if a number is odd or if it is even isPrime():
 *         Must return if a number is prime or if it is composite
 *         isPalindrome(): Must return if a number is a palindrome or if it is
 *         not
 * 
 * 
 */
interface PerformOperation{
	
	boolean check(int a);
	
}

public class MoreLambdas {

	public static void main(String[] args) {
		
		MoreLambdas op = new MoreLambdas();
		
		try(Scanner input = new Scanner(System.in)){
			
			int numCases = input.nextInt();
			
			for(int i = 0; i < numCases; i++) {
				
				int type = input.nextInt();
				int n = input.nextInt();
				
				switch(type) {
				
				case 1:
					if(op.check(op.isOdd(), n)) 
						System.out.println("ODD");
					else 
						System.out.println("EVEN");
					break;
				
				
				case 2:
					if(op.check(op.isPrime(), n))
						System.out.println("PRIME");
					else
						System.out.println("COMPOSITE");
					break;
					
				case 3:
					if(op.check(op.isPalindrome(), n))
						System.out.println("PALINDROME");
					else
						System.out.println("NOT PALINDROME");
					break;
				}
					
			}
			
		}

	}
	
	public boolean check(PerformOperation p, int n) {
		
		return p.check(n);
		
	}
	
	private PerformOperation isOdd() {
		
		return a -> (a % 2 != 0) ? true : false;
		
	}
	
	private PerformOperation isPrime() {
		
		return a -> {
			if(a <= 1)
				return false;
			for(int i = 2; i * i <= a; i++) {
				if(a % i == 0)
					return false;
			}
			
			return true;
		};
		
	}
	
	private PerformOperation isPalindrome() {
		
		return a -> a == Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString()) ? true : false;
		
	}

}
