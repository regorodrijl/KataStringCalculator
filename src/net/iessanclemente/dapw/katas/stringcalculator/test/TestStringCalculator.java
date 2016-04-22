package net.iessanclemente.dapw.katas.stringcalculator.test;

import static org.junit.Assert.*;
import net.iessanclemente.dapw.katas.stringcalculator.StringCalculator;

import org.junit.Before;
import org.junit.Test;

public class TestStringCalculator {

	private StringCalculator sc;

	@Before
	public void setUp() throws Exception {
		sc = new StringCalculator();
	}

	@Test
	public void testEmtyStringReturnCero() {
		int result = sc.add("");
		assertEquals(0, result);
	}

	@Test
	public void testAtNumberReturnTheNumber() {
		int shouldBeOne = sc.add("1");
		int shouldBeTwo = sc.add("2");
		assertEquals(1, shouldBeOne);
		assertEquals(2, shouldBeTwo);
	}
	
	@Test
	public void testTwoNumbersReturnTheSumOfThems() {
		int shouldBeThree = sc.add("1,2");
		assertEquals(3, shouldBeThree);
	}
	@Test
	public void testManyNumbersReturnTheSumOfThems() {
		int shouldBeSix = sc.add("1,2,3");
		int shouldBeTen = sc.add("1,2,3,4");
		assertEquals(6, shouldBeSix);
		assertEquals(10, shouldBeTen);
	}
	@Test
	public void testCRSeparator() {
		int shouldBeThree = sc.add("1\n2");
		assertEquals(3, shouldBeThree);
	}
}
