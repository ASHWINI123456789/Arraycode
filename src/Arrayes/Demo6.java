package Arrayes;

import java.util.Arrays;

public class Demo6 {

	private static void arraywithsort(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
	private static void arraywithoutsort(int arr[]) {
	int temp;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				
				
				
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]= {43,89,21,-2,97,1,32};
arraywithsort(x);
System.out.println();
System.out.println("=========================");
arraywithoutsort(x);
	}


}


