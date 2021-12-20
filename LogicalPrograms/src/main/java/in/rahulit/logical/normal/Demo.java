package in.rahulit.logical.normal;

public class Demo {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			for (int m = n - 1; m >= i; m--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
