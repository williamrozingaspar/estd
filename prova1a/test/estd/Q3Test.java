package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void q3Test() {
		Q3 q = new Q3();
		int[] n = { 1, 3, 2, 2, 5, 2, 7, 2 };
		boolean result = q.q3(n);
		Assert.assertTrue(result);
	}

}
