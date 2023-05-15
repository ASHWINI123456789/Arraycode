package Arrayes;
import  java.util.Scanner;

public class Array1 {

	
		private static void arraySumofEvenOdd(int arr[]) {
			int  evensum=0; int oddsum = 0;
			for(int x:arr) {
				if(x%2==0) {
					evensum +=x;
				}
					else {
						oddsum+=x;
					}
			}
			System.out.println("even sum="+evensum);
		System.out.println("odd sum="+oddsum);
					
		}
				public static void main(String[]args) {
					Scanner Scan = new Scanner(System.in);
					System.out.println("please enter the size of array:");
					int size = Integer.parseInt(Scan.nextLine());
					//create an array with  the size;
					int[]intArray=new int[size];
					for(int i=0;i<size;i++) {
						System.out.println("please enter a number");
						intArray[i]=Integer.parseInt(Scan.nextLine());
						
					}
					arraySumofEvenOdd(intArray);
					
				}
			
}	


