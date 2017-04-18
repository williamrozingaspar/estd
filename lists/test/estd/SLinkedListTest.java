package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void getSizeTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Assert.assertTrue(linkedList.getSize() == 0);
		Assert.assertTrue(linkedList.isEmpty());
		
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);

		Assert.assertTrue(linkedList.getSize() == 3);
		Assert.assertFalse(linkedList.isEmpty());
	}
	
	@Test
	public void removeFirstTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
	}	
	
	@Test
	public void printTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		Node<String> element = linkedList.getFirst();
		while(element != null) {
			System.out.println(element.getValue());
			element = element.getNext();
		}
	}	
	
	@Test
	public void searchValue() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		
		Assert.assertEquals(nodeB, linkedList.search("B"));
		Assert.assertNull(linkedList.search("Z"));
	}
	
	@Test
	public void nodeHeight() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Node<String> nodeA = new Node<>("A");
		Node<String> nodeB = new Node<>("B");
		Node<String> nodeC = new Node<>("C");
		Node<String> nodeD = new Node<>("D");

		linkedList.add(nodeA);
		linkedList.add(nodeB);
		linkedList.add(nodeC);
		Assert.assertEquals(-1, linkedList.getNodeHeigth(nodeD));
	}
}
