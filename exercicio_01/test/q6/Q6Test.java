package q6;

import org.junit.Assert;
import org.junit.Test;

public class Q6Test {

	@Test
	public void searchTest() {
		DLinkedList<String> linkedList = new DLinkedList<>();
		DNode<String> nodeA = new DNode<>("A");
		DNode<String> nodeB = new DNode<>("B");
		DNode<String> nodeC = new DNode<>("C");
		linkedList.addLast(nodeA);
		linkedList.addLast(nodeB);
		linkedList.addLast(nodeC);
		
		DLinkedList<String> result = Q6.invert(linkedList);
		
		Assert.assertEquals("A", result.getLast().getValue());
		Assert.assertEquals("C", result.getFirst().getValue());

	}

}
