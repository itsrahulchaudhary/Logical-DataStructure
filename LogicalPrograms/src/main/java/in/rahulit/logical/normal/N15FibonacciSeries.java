package in.rahulit.logical.normal;

/*
 *  The Fibonacci sequence, in which each number is the sum of the two preceding ones. 
 *  The sequence commonly starts from 0 and 1
 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 *  
 */
public class N15FibonacciSeries {
	public static void main(String[] args) {

		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		int c;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
