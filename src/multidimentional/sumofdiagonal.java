package multidimentional;

import java.util.Scanner;

public class sumofdiagonal {
private static void findsumofDiagonal(int[][]a,int rows,int cols) {
	int lsum,rsum;
	lsum=rsum=0;
	for(int i=0;i< rows;i++){
		for(int j=0;j< cols;j++){
			if(i==j) {
				lsum=lsum+a[i][j];
			}
			if((i+j)==(rows -1)) {
			rsum=rsum+a[i][j];
		}
	}//end of j loop
	}//end of i loop
	
	//print the matrix
	for(int i=0;i<rows;i++) {
		for (int j=0;j<cols;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Left diagonal sum:"+lsum);
System.out.println("Right diagonal sum:"+rsum);

}
public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("please enter number of rows: ");
int rows=Integer.parseInt(scan.nextLine());
System.out.println("please enter number of cols: ");
int cols = Integer.parseInt(scan.nextLine());
if(rows!=cols) {
	System.out.println("It's a rectangle matrix,so we can't find diagonall!!!");
	System.exit(1);
}
int[][]arr=new int [rows][cols];
for(int i=0;i<rows;i++) {
	for(int j=0;j<cols;j++) {
	System.out.println("pleas enter  element for("+i+","+j+")");
arr[i][j]=Integer.parseInt(scan.nextLine());
}
}
findsumofDiagonal(arr,rows,cols);

}
}


