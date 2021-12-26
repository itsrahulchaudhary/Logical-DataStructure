package in.rahulit.logical.arrays;

public class A06KthSmallestNo {
	
	public static void main(String[] args) {
		int arr[] = { 7, 3, 9, 1, 5, 6 };
		int k = 3;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(k + " smallest elements :: " + arr[i]);
				break;
			}
		}
	}
}
