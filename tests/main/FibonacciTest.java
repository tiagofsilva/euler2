package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testGetFirstEvenNumberOfSequence() {
		assertEquals(2, new Fibonacci().sumEvenNumbersUntil(1));
	}
	
	@Test
	public void testSumSecondEvenNumberOfSequence() {
		assertEquals(2, new Fibonacci().sumEvenNumbersUntil(2));
	}
	
	@Test
	public void testSumCentennialEvenNumberOfSequence() {
		assertEquals(188, new Fibonacci().sumEvenNumbersUntil(100));
	}
	
	@Test
	public void testSum4MillionEvenNumberOfSequence() {
		assertEquals(4613732, new Fibonacci().sumEvenNumbersUntil(4000000));
	}

}
