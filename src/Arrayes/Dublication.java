package Arrayes;

import java.util.Arrays;

public class Dublication {
	private static void printDublication(int []arr) {
		Arrays.sort(arr);
		boolean flage = false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]&& flage==false) {
				System.out.println(arr[i]);
				flage=true;
				
			}
			if(arr[i]!=arr[i+1]) {
				flage = false;
			}
		}
	}
	public static void main(String[]args) {
		int intArr[]= {20,2,89,2,6,20,2,3,4,3,8,6,9,8,9,6,9};
		printDublication(intArr);
	}

			}
		
	
