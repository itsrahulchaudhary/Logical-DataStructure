package in.rahulit.logical.arrays;

public class A01SearchMaximumNo {
	
	public static void main(String[] args) {
		
		int arr[] = {7,3,9,1,5,6};
		int max=arr[0];
		System.out.println(arr.length);
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Element is :: "+max);
	}

}
