package in.rahulit.logical.star;
public class StarPattern03 {

	public static void main(String[] args) {
		/*
	      ------------------------------
			    * 
			    * * 
			    * * * 
			    * * * *
			    * * * * *
			    * * * * * *
			    * * * * *
			    * * * *
			    * * *
			    * *
			    * 
		  ------------------------------
	       */
		
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		for (int x = 1; x <= n; x++) {
			for (int y = n - 1; y >= x; y--) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
