package estd;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void q1Test() {
		Q2 q = new Q2();
		String s = "oxamana";
		String result = q.q2(s);
		String expected = "oamana";
		Assert.assertEquals(expected, result);
	}

}
