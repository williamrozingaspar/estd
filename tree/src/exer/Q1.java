package exer;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class Q1 {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<>("A");
		TreeNode<String> b = root.addChild("B");
		TreeNode<String> i = b.addChild("I");
		TreeNode<String> c = root.addChild("C");
		TreeNode<String> d = c.addChild("D");
		TreeNode<String> e = c.addChild("E");
		TreeNode<String> f = c.addChild("F");
		TreeNode<String> g = f.addChild("G");
		TreeNode<String> h = g.addChild("H");

		bfs(root);
		remove(c);
		bfs(root);
	}

	public static void remove(TreeNode<String> toRemove) {

		if (toRemove.isRoot()) {
			return;
		}

		if (toRemove.getChildren().isEmpty()) {
			toRemove.getParent().getChildren().remove(toRemove);
		} else {
			TreeNode<String> firstChild = toRemove.getChildren().get(0);
			toRemove.getParent().getChildren().add(firstChild);
			for (int i = 1; i < toRemove.getChildren().size(); i++) {
				firstChild.getChildren().add(toRemove.getChildren().get(i));

			}
			toRemove.getParent().getChildren().remove(toRemove);
			toRemove = null;
		}

	}
	
	public static void bfs(TreeNode<String> start) {
		Queue<TreeNode<String>> queue = new LinkedList<>();
		queue.add(start);

		while (!queue.isEmpty()) {
			TreeNode<String> node = queue.poll();
			System.out.println(node);

			for (TreeNode<String> child : node.getChildren()) {
				queue.add(child);
			}
		}
	}	

}
