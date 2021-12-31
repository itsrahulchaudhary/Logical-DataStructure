package in.rahulit.logical.arrays;

// Find Missing Number In Array In Java 
public class A14MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6 };
		int expected_no_elements = arr.length + 1;
		int total_sum = expected_no_elements * (expected_no_elements + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Missing Number :: " + (total_sum - sum));
	}

}
