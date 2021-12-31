package in.rahulit.logical.arrays;

public class A10FirstDublicateElement1 {

	public static void main(String[] args) {

		int[] arr = { 6, 5, 3, 25, 3, 6 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					temp = temp + 1;
					System.out.println("First Dublicate ELement is " + arr[i]);
					break;
				}
			}
			if (temp > 0) {
				break;
			}
		}
	}

}
