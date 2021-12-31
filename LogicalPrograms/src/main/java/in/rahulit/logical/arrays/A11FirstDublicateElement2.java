package in.rahulit.logical.arrays;

import java.util.HashSet;

public class A11FirstDublicateElement2 {
	public static void main(String[] args) {

		int[] arr = { 6, 5, 3, 25, 3, 6 };
		int temp = -1;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = arr.length-1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				temp = i;
			} else {
				set.add(arr[i]);
			}
		}
		if (temp != -1) {
			System.out.println("First Dublicate element " + arr[temp]);
		} else {
			System.out.println("Dublicate not found");
		}
	}

}
