package Arrayes;

import java.util.HashMap;
import java.util.Map;

public class Occurenceofeach {
	private static void findoccurence(int[]arr) {
		Map<Integer,Integer>Map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(Map.containsKey(arr[i])) {
				int count=Map.get(arr[i]);
				count++;
			Map.put(arr[i], count);
			}
			else {
				Map.put(arr[i],1);
				
			}
		
		}
		System.out.println(Map);
	}
	public static void main(String[] args) {
	int[]intArray= {1,2,1,2,3,2,1,4,3,4,5,4,5,5,1,1,1,4,6,5,2,2};
		findoccurence(intArray);

	}

}
