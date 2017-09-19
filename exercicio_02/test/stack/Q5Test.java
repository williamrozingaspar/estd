package stack;

import org.junit.Assert;
import org.junit.Test;

public class Q5Test {

	@Test
	public void cloneTest() {
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(3);
		stack.push(5);
		stack.push(4);
		stack.push(6);

		Stack<Integer> clone = stack.cloneStack();

		Assert.assertTrue(clone.getSize() == stack.getSize());
		
		while (!stack.isEmpty()) {
			Assert.assertEquals(stack.pop(), clone.pop());
		}
		
	}

}
