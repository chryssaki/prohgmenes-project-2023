package gr.upatras.project.e1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractTest {
	@Test
	void positive() {
		Subtract tester = new Subtract();
		assertEquals("POSITIVE", tester.subtract(10, 5));
		assertEquals("POSITIVE", tester.subtract(7, 5));
	}
	@Test
	void negative() {
		Subtract tester = new Subtract();
		assertEquals("NEGATIVE", tester.subtract(5, 10));
		assertEquals("NEGATIVE", tester.subtract(7, 10));
	}
	@Test
	void zero() {
		Subtract tester = new Subtract();
		assertEquals("ZERO", tester.subtract(5, 5));
	}
}
