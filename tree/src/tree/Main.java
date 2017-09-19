package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

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

		//bfs(root);
		System.out.println(search(root,"G"));
		System.out.println(search(root,"K"));
	}
	
	public static boolean search(TreeNode<String> start, String s) {
		Queue<TreeNode<String>> queue = new LinkedList<>();
		queue.add(start);
		while (!queue.isEmpty()) {
			TreeNode<String> node = queue.poll();
			if (node.getValue().equals(s)) {
				return true;
			}

			for (TreeNode<String> child : node.getChildren()) {
				queue.add(child);
			}
		}
		return false;
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

	public static void dfs(TreeNode<String> start) {
		System.out.println(start);
		for (TreeNode<String> node : start.getChildren()) {
			dfs(node);
		}
	}

}
