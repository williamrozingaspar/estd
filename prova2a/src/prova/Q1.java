package prova;

import java.util.Stack;

public class Q1 {

	public Stack<Integer> q1(int[] a, int[] b) {
		Stack<Integer> result = new Stack<>();

		for (int i : a) {
			result.push(i);
		}

		for (int i : b) {
			result.push(i);
		}
		
		return result;
	}

}
