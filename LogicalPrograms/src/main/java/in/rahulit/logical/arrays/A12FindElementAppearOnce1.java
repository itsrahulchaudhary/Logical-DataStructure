package in.rahulit.logical.arrays;
// not working
public class A12FindElementAppearOnce1 {

	public static void main(String[] args) {

		int[] arr = { 6, 5, 3, 25, 3, 6 };

		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		System.out.println(res);
	}

}
