package estd;

public class DNode<T> {

	private  DNode<T> next;
	private  DNode<T> previous;
	
	private T value;
	
	public DNode(T t) {
		value = t;
	}

	public DNode<T> getNext() {
		return next;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
