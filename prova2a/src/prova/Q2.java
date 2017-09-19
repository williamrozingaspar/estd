package prova;

import java.util.Stack;

public class Q2 {

	public char[] q2(Stack<Character> a, Stack<Character> b) {
		int size = a.size() + b.size();
		char[] result = new char[size];
		int i = 0;

		while (!a.isEmpty()) {
			result[i] = a.pop();
			i = i + 1;
		}
		
		while (!b.isEmpty()) {
			result[i] = b.pop();
			i = i + 1;
		}

		return result;

	}

}
