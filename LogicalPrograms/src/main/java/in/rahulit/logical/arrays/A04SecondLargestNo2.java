package in.rahulit.logical.arrays;

public class A04SecondLargestNo2 {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 9, 1, 5, 6 };
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else if (arr[i] > second_largest && arr[i] != largest) {
				second_largest = arr[i];
			}
		}
		System.out.println("Second Largest No :: " + second_largest);

	}

}
