package queue;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void q2Test() {
		Q2 questao = new Q2();

		Double[] a = { 1.0, 2.0 };
		Double[] b = { 2.0, 3.0 };

		Queue<Double> result = questao.q2(a, b);

		Assert.assertEquals(result.dequeue(), Double.valueOf(1.0));
		Assert.assertEquals(result.dequeue(), Double.valueOf(8.0));
		Assert.assertEquals(result.dequeue(), Double.valueOf(8.0));
		Assert.assertEquals(result.dequeue(), Double.valueOf(27.0));

	}

}
