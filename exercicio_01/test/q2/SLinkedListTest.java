package q2;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void searchTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);

		int result = linkedList.getNodeHeight(nodeA);
		Assert.assertTrue(result == 2);

		int result2 = linkedList.getNodeHeight(nodeC);
		Assert.assertTrue(result2 == 0);

		int result3 = linkedList.getNodeHeight(new Node<>("F"));
		Assert.assertTrue(result3 == -1);

		
	}

}
