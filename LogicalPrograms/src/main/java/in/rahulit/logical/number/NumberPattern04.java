package in.rahulit.logical.number;

public class NumberPattern04 {

	public static void main(String[] args) {
		/*
	      ------------------------------
			       1
                   2 1
                   3 2 1
                   4 3 2 1
                   5 4 3 2 1
		  ------------------------------
	       */
		int n =5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1 ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
