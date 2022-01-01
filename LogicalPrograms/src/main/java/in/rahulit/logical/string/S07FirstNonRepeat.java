package in.rahulit.logical.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
// Java Program To Find First Non Repeated Character
public class S07FirstNonRepeat {
	public static void main(String[] args) {
		String str = "AABBCDE";

		// Approach-1
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}

		System.out.println("----------------------------------------");

		// Approach-2

		Map<Character, Integer> map = new HashMap();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

 		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}

	}

}
