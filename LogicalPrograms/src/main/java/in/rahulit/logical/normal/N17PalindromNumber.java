package in.rahulit.logical.normal;
/*
 * A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number 
 *  (such as 16461) that remains the same when its digits are reversed.
 *  eg - 131
 */
public class N17PalindromNumber {
	public static void main(String[] args) {
		int no = 122;
		int temp = no;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println(no + " is palindrome Number");
		} else {
			System.out.println(no + " is not palindrome Number");

		}
	}

}
