/**
 * 
 */
package com.ss.jb.four;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

/**
 * @author Kevin
 * Tests for getSlope, getDistance, and parallelTo methods
 */
public class LineTest {

	@Test
	public void getSlopeTest() {
		
		//test vertical line
		Line line = new Line(0, 0, 0, 1);
		assertThrows(ArithmeticException.class, line::getSlope);
		
		line = new Line(0, 0, 1, 1);
		assertEquals(1, line.getSlope(), 0.0001);
		
	}

	@Test
	public void getDistanceTest() {
		
		Line line = new Line(0, 0, 0, 0);
		assertEquals(0, line.getDistance(), 0.0001);
		
		line = new Line(0, 0, 1, 1);
		assertEquals(Math.sqrt(2), line.getDistance(), 0.0001);
		
	}
	
	@Test
	public void parallelToTest() {
		
		//same lines, parallel
		Line a = new Line(0, 0, 1, 1);
		Line b = new Line(0, 0, 1, 1);
		assertTrue(a.parallelTo(b));
		
		//not parallel
		a = new Line(0, 0, 1, 1);
		b = new Line(1, 1, 2, 1);
		assertFalse(a.parallelTo(b));
		
	}
	
}
