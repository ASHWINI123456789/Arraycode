package Arrayes;

public class Demo3 {
	private static void reversArray(int arr[]) {
		int largest = arr[0];
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
	    largest=arr[i];
			}
		
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
			
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

public static void main(String[]args) {
		int x[]= {45,21,34,78,3,59};
		reversArray(x);
}
}

