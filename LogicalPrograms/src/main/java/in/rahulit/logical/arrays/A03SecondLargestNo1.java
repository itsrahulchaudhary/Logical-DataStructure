package in.rahulit.logical.arrays;

public class A03SecondLargestNo1 {

	public static void main(String[] args) {
		int arr[] = { 7, 3, 9, 1, 5, 6 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Largest No :: " + arr[1]);

	}

}
