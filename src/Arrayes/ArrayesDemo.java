package Arrayes;
import java.util.Scanner;

public class ArrayesDemo {
	private static void arraysumAndAverage(int arr[]) {
		int sum = 0;
	   for(int x:arr) {
			sum+= x;
	   }
	   double average = (double) sum /arr.length;
	   System.out.println("sum of elements:"+sum);
	   System.out.println("average of elements: "+average);
	
	}
	
	 public static void main(String[]args) {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("please enter the size of array:");
		 //create an array with the size
		 int size = Integer.parseInt(scan.nextLine());
		 int[]intArray=new int[size];
		 
		 //take the input values
		 for(int i=0;i<size;i++){
			System.out.println("please enter a number");
			intArray[i]=Integer.parseInt(scan.nextLine());
		 }
		 arraysumAndAverage(intArray);
        scan.close();			
		
	 }
}
		

 