package ch.fhnw.richards.week09_Comparing.solutions.fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {
	private static final Fraction zero = new Fraction(0, 1);
	private static final Fraction oneHalf = new Fraction(1,2);
	private static final Fraction oneQuarter = new Fraction(1, 4);
	private static final Fraction minusOneHalf = new Fraction(-1,2);
	private static final Fraction minusOneQuarter = new Fraction(-1,4);

	@Test
	public void testEquals() {
		assertEquals(oneHalf, new Fraction(13, 26));
		assertEquals(new Fraction(-1,2), new Fraction(2, -4));
		assertEquals(zero, new Fraction(0, 26));
	}
	
	@Test
	public void testCompareTo() {
		assertTrue(oneHalf.compareTo(new Fraction(13,26)) == 0);
		assertTrue(minusOneHalf.compareTo(new Fraction(-13,26)) == 0);
		assertTrue(oneHalf.compareTo(minusOneHalf) > 0);
		assertTrue(minusOneHalf.compareTo(oneHalf) < 0);
		assertTrue(oneHalf.compareTo(oneQuarter) > 0);
		assertTrue(oneQuarter.compareTo(oneHalf) < 0);
		assertTrue(minusOneHalf.compareTo(minusOneQuarter) < 0);
		assertTrue(minusOneQuarter.compareTo(minusOneHalf) > 0);
	}
	
	@Test
	public void testAdd() {
		assertEquals(oneHalf, oneQuarter.add(oneQuarter));
		assertEquals(minusOneHalf, minusOneQuarter.add(minusOneQuarter));
		assertEquals(zero, oneQuarter.add(minusOneQuarter));
		assertEquals(zero, minusOneQuarter.add(oneQuarter));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(zero, oneHalf.subtract(oneHalf));
		assertEquals(zero, minusOneHalf.subtract(minusOneHalf));
		assertEquals(oneHalf, oneQuarter.subtract(minusOneQuarter));
		assertEquals(minusOneHalf, minusOneQuarter.subtract(oneQuarter));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(oneQuarter, oneHalf.multiply(oneHalf));
		assertEquals(oneQuarter, minusOneHalf.multiply(minusOneHalf));
		assertEquals(minusOneQuarter, oneHalf.multiply(minusOneHalf));
		assertEquals(minusOneQuarter, minusOneHalf.multiply(oneHalf));
	}
	
	@Test
	public void testDivide() {
		assertEquals(oneHalf, oneQuarter.divide(oneHalf));
		assertEquals(minusOneHalf, minusOneQuarter.divide(oneHalf));
		assertEquals(minusOneHalf, oneQuarter.divide(minusOneHalf));
		assertEquals(oneHalf, minusOneQuarter.divide(minusOneHalf));
	}

}
