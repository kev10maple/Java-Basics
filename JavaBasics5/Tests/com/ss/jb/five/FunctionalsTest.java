package com.ss.jb.five;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FunctionalsTest {
	
	@Test
	public void rightMostTest() {
		List<Integer> items = Arrays.asList(16, 8, 886, 8, 1);
		List<Integer> output = Arrays.asList(6, 8, 6, 8, 1);
		List<Integer> test = RightMost.rightMost(items);
		
		assertEquals(output, test);
	}
	
	@Test
	public void doubledTest() {
		List<Integer> items = Arrays.asList(6, 8, 6, 8, -1);
		List<Integer> output = Arrays.asList(12, 16, 12, 16, -2);
		List<Integer> test = Doubled.timestwo(items);
		
		assertEquals(output, test);
	}
	
	@Test
	public void removeXTest() {
		List<String> items = Arrays.asList("xxax", "xbxbx", "xxcx");
		List<String> output = Arrays.asList("a", "bb", "c");
		List<String> test = RemoveX.noX(items);
	
		assertEquals(output, test);
	}

}
