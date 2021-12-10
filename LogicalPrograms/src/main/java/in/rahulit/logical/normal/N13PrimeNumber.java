package in.rahulit.logical.normal;

/**
 * Prime numbers are the numbers that have only two factors, that are, 1 and the
 * number itself. Consider an example of number 5, which has only two factors 1
 * and 5. This means it is a prime number. Let's take another example of the
 * number 6, which has more than two factors, i.e 1, 2, 3, and 6.This means 6 is not a prime number. 
 */
public class N13PrimeNumber {
	public static void main(String[] args) {
		int no = 7;
		int temp = 0;
		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(no + " is a prime number");
		} else {
			System.out.println(no + " is not a prime number");

		}
	}
}
