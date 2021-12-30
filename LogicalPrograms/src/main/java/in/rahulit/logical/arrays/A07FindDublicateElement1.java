package in.rahulit.logical.arrays;

import java.util.HashSet;
import java.util.Set;

public class A07FindDublicateElement1 {
	public static void main(String[] args) {

		int[] arr = { 3, 5, 4, 3, 2, 2, 1, 2 };
		System.out.println("Dublicate Elements are : ");
		Set<Integer> s = new HashSet<Integer>();
		for (int no : arr) {
			boolean add = s.add(no);
			if (add == false) {
				System.out.print(no + " ");
			}
		}
	}

}
