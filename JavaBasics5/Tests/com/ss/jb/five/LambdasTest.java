/**
 * 
 */
package com.ss.jb.five;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Kevin
 *
 */
public class LambdasTest {
	
	MoreLambdas op = new MoreLambdas();

	@Test
	public void isOddTest() {
		assertTrue(op.check(op.isOdd(), 3));
		assertFalse(op.check(op.isOdd(), 4));
	}
	
	@Test
	public void isPrimeTest() {
		assertTrue(op.check(op.isPrime(), 7));
		assertFalse(op.check(op.isOdd(), 8));
	}
	
	@Test
	public void isPalindromeTest() {
		assertTrue(op.check(op.isPalindrome(), 696));
		assertFalse(op.check(op.isPalindrome(), 420));
	}
	
}
