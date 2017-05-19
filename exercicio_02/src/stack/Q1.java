package stack;

public class Q1 {

	public Stack<Integer> toStack (int[] n) {
		Stack<Integer> myStack = new ArrayStack<>();
		
		for(int i : n) {
			myStack.push(i);
		}
		
		return myStack;
	}
	
}
