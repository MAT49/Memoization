package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	@DisplayName("Fibonacci test method")
	void fib() {
		Fibonacci fibby = new Fibonacci();
		int expected = 3;
		int actual = fibby.fib(4, new int[3]);
		assertEquals(expected, actual, "should return 3");
	}

}
