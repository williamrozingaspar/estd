package estd;

public class Q2 {

	public String q2(String s) {
		String result = "";
		char[] chars = s.toCharArray();
		
		for (char c : chars) {
			if (c != 'X' && c != 'x') {
				result += c;
			}
		}
		
		return result;
	}

}
