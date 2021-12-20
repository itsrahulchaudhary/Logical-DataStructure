package in.rahulit.logical.star;

public class StarPattern15 {

	public static void main(String[] args) {
       /*   
        ------------------------------------  
		*****
		*   *
		*   *
		*   *
		*****
		------------------------------------
		*/
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// System.out.print("*");
				if (i >= 2 && j >= 2 && i <= n - 1 && j <= n - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
