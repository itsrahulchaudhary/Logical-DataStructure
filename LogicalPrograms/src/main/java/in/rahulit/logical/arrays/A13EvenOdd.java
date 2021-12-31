package in.rahulit.logical.arrays;

import java.util.ArrayList;
import java.util.List;

public class A13EvenOdd {
	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 2, 8, 1, 9 };
		List<Integer> al1 = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				al1.add(arr[i]);
			} else {
				al2.add(arr[i]);
			}
		}

		System.out.println("Even no are's :: ");
		int total1 = 0;
		for (int no1 : al1) {
			total1 = total1 + no1;
			System.out.print(no1 + " ");
		}
		System.out.println();
		System.out.println("Total no of even no are " + al1.size());
		System.out.println("Sum of even are " + total1);

		System.out.println("--------------------------------------------");

		System.out.println("Odd no are's :: ");
		int total2 = 0;
		for (int no2 : al2) {
			total2 = total2 + no2;
			System.out.print(no2 + " ");
		}
		System.out.println();
		System.out.println("Total no of odd no are " + al2.size());
		System.out.println("Sum of odd are " + total2);

	}

}
