package check;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controller.Calc;

public class TestCase {

	@Test
	public void testSum() {
		int x = 10;
		double y = 11;

		assertEquals(21, Calc.sum(x, y), 0.1);
	}

	@Test
	public void testSub() {
		int x = 10;
		double y = 11;

		assertEquals(-1, Calc.sub(x, y), 0.1);
	}

	@Test
	public void testDiv() throws Exception {
		int x = 11;
		double y = 11;

		assertEquals(1, Calc.div(x, y), 0.1);
	}

	@Test
	public void testMult() {
		int x = 10;
		double y = 11;

		assertEquals(110, Calc.mult(x, y), 0.1);
	}
}
