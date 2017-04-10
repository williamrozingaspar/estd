package estd;

public class Q3 {

	public boolean q3(int[] n) {
		int result = 0;
		
		for (int i : n) {
			if (i == 2) {
				result += i;
			}
		}
		
		return (result == 8);
	}

}
