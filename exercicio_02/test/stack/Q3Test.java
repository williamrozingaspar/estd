package stack;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {

	@Test
	public void q1Test() {
		Q3 q3 = new Q3();
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(3);
		stack.push(5);
		stack.push(4);
		stack.push(6);

		int[] result = q3.toArray(stack);
		
		Assert.assertTrue(result[0] == 6);
		Assert.assertTrue(result[1] == 4);
		Assert.assertTrue(result[2] == 0);
		Assert.assertTrue(result[3] == 0);
		

	}

}
