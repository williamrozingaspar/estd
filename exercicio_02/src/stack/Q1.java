package stack;

public class Q1 {

	public Stack<Integer> toStack (int[] array) {
		
		Stack<Integer> stack = new ArrayStack<>();
		
		for (int elem : array) {
			stack.push(elem);
		}
		
		return stack;
	}
	
}
