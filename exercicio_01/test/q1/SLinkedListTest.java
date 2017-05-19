package q1;

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

		Node<String> result = linkedList.search("B");
		Assert.assertEquals(nodeB, result);

		Node<String> result2 = linkedList.search("F");
		Assert.assertNull(result2);
		
		Node<String> result3 = linkedList.search("C");
		Assert.assertEquals(nodeC, result3);

	}

}
