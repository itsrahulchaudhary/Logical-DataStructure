package in.rahulit.logical.arrays;

public class A02SearchMinimumNo {

public static void main(String[] args) {
		
		int arr[] = {7,3,9,1,5,6};
		int min=arr[0];
		System.out.println(arr.length);
		for(int i=1; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Element is :: "+min);
	}
}
