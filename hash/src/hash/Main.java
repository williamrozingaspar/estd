package hash;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String s = "ABBCDDD";
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (map.containsKey(c)) {
				Integer value = map.get(c) + 1;
				map.put(c, value);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);
	}

}
