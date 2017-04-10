package estd;

public class Q1 {

	public boolean q1(int[] n) {

		for (int i = 0; i < n.length; i++) {
			if ((i + 1) < n.length && n[i] == 2 && n[i + 1] == 2) {
				return true;
			}
		}

		return false;
	}

}
