package java_test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMultiply2 {
	@Test
	public void test1() {
		assertEquals(Multiply2.multiply2(1), 2);
	}

	@Test
	public void test0() {
		assertEquals(Multiply2.multiply2(0), 0);
	}

	@Test
	public void testMinus1() {
		assertEquals(Multiply2.multiply2(-1), -2);
		System.out.println("new commit");
	}
}
