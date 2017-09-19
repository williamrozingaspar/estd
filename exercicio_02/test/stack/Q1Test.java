package stack;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void q1Test() {
		Q1 q1 = new Q1();
		int[] array = { 2, 4, 6 };
		Stack<Integer> stack = q1.toStack(array);

		Assert.assertTrue(stack.getSize() == 3);
		Assert.assertTrue(stack.pop() == 6);
		Assert.assertTrue(stack.pop() == 4);
		Assert.assertTrue(stack.pop() == 2);
		
	}

}
