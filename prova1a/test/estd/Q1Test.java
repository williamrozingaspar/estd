package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 q = new Q1();
		int[] n = { 1, 3, 2, 2, 5 };
		boolean result = q.q1(n);
		Assert.assertTrue(result);
		
		int[] m = { 1, 3, 5, 2 };
		result = q.q1(m);
		Assert.assertFalse(result);
		
		
	}

}
