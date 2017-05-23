package stack;

public class Q3 {

	public int[] toArray (Stack<Integer> stack) {
		int[] result = new int[stack.getSize()];
		int i = 0;

		while(!stack.isEmpty()) {
			int aux = stack.pop();
			if (aux % 2 == 0) {
				result[i++] = aux;
			}
		}

		return result;
	}
	
}
