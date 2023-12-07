package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		int arr1[] = {3,2,11,4,6,7};
		
		List<Integer> list1 = 	new ArrayList<Integer>();
		
	
		
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		
		}
		
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list1.get(list1.size()-2));
	}	

}
