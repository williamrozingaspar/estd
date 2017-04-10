package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void q4Test() {
		Q4 q = new Q4();
		int[] n = { 1, 3, 2, 2, 5, 2, 7, 5 };
		boolean result = q.q4(n);
		Assert.assertTrue(result);
	}

}
