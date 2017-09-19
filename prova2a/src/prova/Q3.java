package prova;

import java.util.Stack;

public class Q3 {

	public boolean q3(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();
		String temp = "";
		
		for (char c : chars) {
			stack.push(c);
		}
		
		while(!stack.isEmpty()) {
			temp = temp + stack.pop();
		}
		
		return s.equals(temp);
	}

}
