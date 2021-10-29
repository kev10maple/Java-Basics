package com.ss.jb.five;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RecursionTest {
	
	@Test
	public void groupSumClumpTest() {
		int[] arr1 = {2, 4, 8};
		int[] arr2 = {1, 2, 4, 8, 1};
		int[] arr3 = {2, 4, 4, 8};
		
		assertTrue(Recursion.groupSumClump(0, arr1, 10));
		assertTrue(Recursion.groupSumClump(0, arr2, 14));
		assertFalse(Recursion.groupSumClump(0, arr3, 14));
	}

}
