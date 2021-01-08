package com.yaswanth.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test_emptyString() {
		StringCalculator sc = new StringCalculator();
		assertEquals(0, sc.add(""));
	}
	
	@Test
	public void test_oneNumber() {
		StringCalculator sc = new StringCalculator();
		assertEquals(5, sc.add("5"));
	}
	
	@Test
	public void test_twoNumber() {
		StringCalculator sc = new StringCalculator();
		assertEquals(7, sc.add("3,4"));
	}
}
