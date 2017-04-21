package estd;

public class SLinkedList<T> {

	private Node<T> first;

	private Node<T> last;

	private long size = 0;

	public long getSize() {
		return size;
	}

	public void removeFirst() {
		if (!isEmpty()) {
			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = null;
			}
		}
	}

	public void add(Node<T> node) {
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
		}
		size++;
	}

	public Node<T> search(T value) {
		Node<T> aux = this.getFirst();
		while (aux != null) {
			if (aux.getValue().equals(value)) {
				return aux;
			}
			aux = aux.getNext();
		}
		return null;
	}

	public int getNodeHeigth(Node<T> node) {
		Node<T> aux = this.getFirst();
		int i = -1;

		while (aux != null) {
			if (aux.equals(node) || i >= 0) {
				i++;
			}
			aux = aux.getNext();
		}
		return i;
	}

	public int getNodeDepth(Node<T> node) {
		Node<T> aux = this.getFirst();
		int i = -1;
		
		while(aux != null) {
			i++;
			if(aux.equals(node)) {
				return i;
			}
		}
		
		return i;
	}

	public boolean equals(SLinkedList<T> list) {
		Node<T> auxA = this.getFirst();
		Node<T> auxB = list.getFirst();
		boolean isNodeEquals = this.getSize() == list.getSize();

		while(isNodeEquals) {
			isNodeEquals = auxA.equals(auxB);
			auxA = auxA.getNext();
			auxB = auxB.getNext();
		}
		
		return isNodeEquals;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

}
