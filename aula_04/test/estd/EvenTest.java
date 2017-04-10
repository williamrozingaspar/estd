package estd;

import org.junit.Assert;
import org.junit.Test;

public class EvenTest {

	@Test
	public void countEvensTest() {
		Even even = new Even();
		int[] nums = { 1,2,3 };
		int resultado = even.countEvens(nums);
		Assert.assertTrue(resultado == 2);
	}

}
