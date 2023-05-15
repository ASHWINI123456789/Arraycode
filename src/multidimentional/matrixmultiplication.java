package multidimentional;
import java.util.Scanner;

public class matrixmultiplication {
	private static void  multiplication (int[][]a,int[][]b) {
		int[][]c=new int[a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
			c[i][j]=0;
			for(int k=0;k<b.length;k++) {
			c[i][j]+=a[i][k]*b[k][j];
		}//end of k loop;
}//end of j loop;
}//end of i loop;
 System.out.println("Element of the first matrix: ");
 for(int i=0;i<a.length;i++) {
 for(int j=0;j<a[0].length;j++) {
 System.out.print(a[i][j]+"  ");
 }
 System.out.println();
 }
 System.out.println("Element of the second matrix: ");
 for(int i=0;i<b.length;i++) {
 for(int j=0;j<b[0].length;j++) {
 System.out.print(b[i][j]+"  ");
 }
 System.out.println();
 }
 System.out.println("Element of the result matrix after multiplication:  ");
 for(int i=0;i<c.length;i++) {
 for(int j=0;j<c[0].length;j++) {
 System.out.print(c[i][j]+"  ");
 }
 
 System.out.println();
 }
	}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("please enter the rows in firsr matrix:  ");
	int rows1=Integer.parseInt(scan.nextLine());
	System.out.println("please enter the cols in first matrix:  ");
	int cols1=Integer.parseInt(scan.nextLine());
	
	System.out.println("please enter the rows in second matrix: ");
	int rows2=Integer.parseInt(scan.nextLine());
	System.out.println("please enter the cols second matrix: ");
	int cols2=Integer.parseInt(scan.nextLine());
	
	if(cols1 !=rows2) {
		System.out.println("We can't multiply the matrices!!!");
		System.exit(1);
	}
	int[][]a=new int [rows1][cols1];
	int [][]b=new int[rows2][cols2];
	
	System.out.println("enter the elements for first matrix");
	for(int i=0;i<rows1;i++) {
	for(int j=0;j<cols1;j++) {
		a[i][j]=Integer.parseInt(scan.nextLine());
	}
	}
	System.out.println("enter the elements for second matrix");
	for(int i=0;i<rows2;i++) {
	for(int j=0;j<cols2;j++) {
		b[i][j]=Integer.parseInt(scan.nextLine());
	}
	}
	multiplication(a,b);

	}

}
