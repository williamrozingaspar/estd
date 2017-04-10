package estd;

import org.junit.Assert;
import org.junit.Test;

public class SLinkedListTest {

	@Test
	public void getSizeTest() {
		SLinkedList<String> linkedList = new SLinkedList<>();
		Assert.assertTrue(linkedList.getSize() == 0);
		
		Node<String> node = new Node<>();
		node.setValue("A");
		linkedList.add(node);
		Assert.assertTrue(linkedList.getSize() == 1);
		
		
	}
}
