package estd;

public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;

	private long size = 0;
	
	public long getSize() {
		return size;
	}

	public void add(Node<T> node) {
		size++;
		
		if (first == null) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}

	}

}
