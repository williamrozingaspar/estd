package prova;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void q2Test() {
		Q2 q2 = new Q2();

		Stack<Character> a = new Stack<>();
		Stack<Character> b = new Stack<>();

		a.push('A');
		a.push('B');
		b.push('C');
		b.push('D');

		char[] result = q2.q2(a, b);
		char[] expected = { 'B', 'A', 'D', 'C' };

		Assert.assertTrue(result.length == 4);
		Assert.assertArrayEquals(expected, result);

	}

}
