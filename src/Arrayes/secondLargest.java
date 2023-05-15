package Arrayes;
public class secondLargest {
private static void printSecondLargest(int []arr) {
	int firstLargest, secondLargest;
	if(arr[0]>arr[1]) {
		 firstLargest = arr[0];
		 secondLargest = arr[1];
	}
	else {
		firstLargest = arr[1];
		secondLargest = arr[0];
		
	}
	for(int i=2;i<arr.length;i++) {
		if(arr[i]>firstLargest) {
			secondLargest=firstLargest;
			firstLargest=arr[i];
			}
		else if(arr[i]<firstLargest && arr[i]>secondLargest) {
			secondLargest = arr[i] ;
			
		}
	}
	System.out.println(secondLargest);

	
}
public static void main(String[] args) {
int	[]intArray= {23,17,67,-34,56};
	printSecondLargest(intArray);
	}

}