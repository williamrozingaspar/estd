package stack;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void popnTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		List<String> result = stack.pop(2);
		
		Assert.assertTrue(result.size() == 2);
		Assert.assertEquals(result.get(0), "C");
		Assert.assertEquals(result.get(1), "B");
		
	}
	
	@Test
	public void popnFullTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		List<String> result = stack.pop(40000);
		Assert.assertTrue(result.size() == 3);
		
	}	

}
