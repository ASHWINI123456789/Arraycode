//withought sorting()method Accending order;  
package Arrayes;

public class Demo4 {
	private static void withoutsorting(int arr[]) {
		
	int temp;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]= temp;
			
		}
	}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	
public static void main(String[]args) {
	int x[]= {45,21,34,78,3,59};
	withoutsorting(x);
}
}


