package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Exercise4;

public class MathTest {
	@Test
	public void test () {
		int three = Exercise4.add(4,5);
		assertEquals(9, three, 0);
	}
	
	
}
