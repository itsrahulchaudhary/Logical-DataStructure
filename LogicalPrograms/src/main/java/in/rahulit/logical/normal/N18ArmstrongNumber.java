package in.rahulit.logical.normal;

public class N18ArmstrongNumber {

	public static void main(String[] args) {
		int no = 154;
		int temp1 = no;
		int length = 0;

		while (temp1 != 0) {
			length = length + 1;
			temp1 = temp1 / 10;
		}

		int rem = 0;
		int temp2 = no;
		int arm = 0;
		while (temp2 != 0) {
			rem = temp2 % 10;
			int mult = 1;
			for (int i = 1; i <= length; i++) {
				mult = mult * rem;
			}
			arm = arm + mult;
			temp2 = temp2 / 10;
		}
		if (no == arm) {
			System.out.println(no + " is a Armstrong Number");
		} else {
			System.out.println(no + " is Not a Armstrong Number");
		}
	}

}
