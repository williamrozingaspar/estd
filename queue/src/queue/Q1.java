package queue;

public class Q1 {

	public Queue<Character> q1(Queue<Character> queue) {
		Queue<Character> result = new ArrayQueue<>();

		while (!queue.isEmpty()) {
			char ch = queue.dequeue();
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				result.enqueue(ch);
			}
		}

		return result;
	}

}
