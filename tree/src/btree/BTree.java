package btree;

public class BTree<E extends Comparable<E>> {

	private BTreeNode<E> root;

	public BTree(E e) {
		root = new BTreeNode<>(e);
	}

	public boolean search(E value) {
		BTreeNode<E> refNode = getRoot();
		while (refNode != null) {
			if (refNode.compareTo(value) == 0) {
				return true;
			} else {
				if (refNode.compareTo(value) > 0) {
					refNode = refNode.getLeftChild();
				} else {
					refNode = refNode.getRightChild();
				}
			}
		}
		return false;
	}

	public void insert(E value) {
		BTreeNode<E> refNode = getRoot();
		while (true) {
			if (refNode.compareTo(value) > 0) {
				if (refNode.getLeftChild() == null) {
					refNode.addLeftChild(value);
					return;
				} else {
					refNode = refNode.getLeftChild();
				}
			} else {
				if (refNode.getRightChild() == null) {
					refNode.addRightChild(value);
					return;
				} else {
					refNode = refNode.getRightChild();
				}
			}
		}
	}

	public BTreeNode<E> getRoot() {
		return root;
	}

	public void setRoot(BTreeNode<E> root) {
		this.root = root;
	}
}
