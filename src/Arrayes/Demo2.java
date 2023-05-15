package Arrayes;

import java.util.Arrays;

public class Demo2 {
private static void reverseArray(int arr[]) {
	int n= arr.length;
	int temp;
	for(int i=0;i<n/2;i++) {
	temp=arr[i];
	arr[i]=arr[n-i-1];
	}
	//for(int x:arr) {
	for(int i=0;i<n;i++) {
		
		System.out.println(arr[i]+ " ");
	}
	System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int intArray[]= {89,-12,50,32,11,0,21,44,76};
		reverseArray(intArray);
		
}
}


