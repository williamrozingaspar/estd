package btree;

public class BTreeNode<E extends Comparable<E>> implements Comparable<E> {

	private E value;

	private BTreeNode<E> parent;

	private BTreeNode<E> leftChild;

	private BTreeNode<E> rightChild;

	public BTreeNode(E e) {
		value = e;
	}

	public BTreeNode<E> addLeftChild(E e) {
		BTreeNode<E> child = new BTreeNode<>(e);
		child.setParent(this);
		setLeftChild(child);
		return child;
	}

	public BTreeNode<E> addRightChild(E e) {
		BTreeNode<E> child = new BTreeNode<>(e);
		child.setParent(this);
		setRightChild(child);
		return child;
	}

	public boolean isRoot() {
		return (parent == null);
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public BTreeNode<E> getParent() {
		return parent;
	}

	public void setParent(BTreeNode<E> parent) {
		this.parent = parent;
	}

	public BTreeNode<E> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BTreeNode<E> leftChild) {
		this.leftChild = leftChild;
	}

	public BTreeNode<E> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BTreeNode<E> rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public int compareTo(E arg0) {
		Comparable<E> val = (Comparable<E>) this.getValue();
		return val.compareTo(arg0);
	}

}
