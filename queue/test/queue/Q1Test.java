package queue;

import org.junit.Assert;
import org.junit.Test;


public class Q1Test {

	
	@Test
	public void q1Test() {
		Q1 questao = new Q1();
		
		Queue<Character> queue = new ArrayQueue<>();
		queue.enqueue('a');
		queue.enqueue('b');
		queue.enqueue('c');
		queue.enqueue('d');
		queue.enqueue('e');
		
		Queue<Character> result =  questao.q1(queue);
		
		Assert.assertTrue(result.getSize() == 2);
		Assert.assertEquals(result.dequeue(), Character.valueOf('a'));
		Assert.assertEquals(result.dequeue(), Character.valueOf('e'));
		
	}
}
