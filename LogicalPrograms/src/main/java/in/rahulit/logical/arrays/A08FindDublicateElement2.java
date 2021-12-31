package in.rahulit.logical.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A08FindDublicateElement2 {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 4, 3, 2, 2, 1, 2 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int no : arr) {
			Integer count = map.get(no);
			if (count == null) {
				map.put(no, 1);
			} else {
				count = count + 1;
				map.put(no, count);
			}
		}
		System.out.println("Dublicate Elements are : ");
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> itr : entrySet) {
			if (itr.getValue() > 1) {
				System.out.print(itr.getKey() + " ");
			}
		}

	}

}
