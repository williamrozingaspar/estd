package queue;

public class Q2 {

	public Queue<Double> q2(Double[] a, Double[] b) {
		Queue<Double> result = new ArrayQueue<>();

		for (Double num : a) {
			result.enqueue(Math.pow(num, 3));
		}

		for (Double num : b) {
			result.enqueue(Math.pow(num, 3));
		}

		return result;
	}

}
