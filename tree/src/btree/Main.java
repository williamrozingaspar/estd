package btree;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class Main {

	public static void main(String[] args) {
		BTree<Integer> btree = new BTree<>(13);
		BTreeNode<Integer> root = btree.getRoot();
		
		btree.insert(10);
		btree.insert(11);
		btree.insert(17);
		btree.insert(18);
		
		bfs(root);
		System.out.println(btree.search(17));
		System.out.println(btree.search(19));
	}

	public static void bfs(BTreeNode<Integer> start) {
		Queue<BTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(start);
		
		while (!queue.isEmpty()) {
			BTreeNode<Integer> node = queue.poll();
			System.out.println(node);
			if (node.getLeftChild() != null) {
				queue.add(node.getLeftChild());
			}
			if (node.getRightChild() != null) {
				queue.add(node.getRightChild());
			}
		}
	}
	
	public static void dfs(BTreeNode<Integer> start) {
		System.out.println(start);
		if (start.getLeftChild() != null) {
			dfs(start.getLeftChild());
		}
		if (start.getRightChild() != null) {
			dfs(start.getRightChild());
		}
	}
	
}
