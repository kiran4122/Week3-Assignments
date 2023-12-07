package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		 
		int arr[]= {1,2,3,4,10,6,8};
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			list1.add(arr[i]);
			
		}

		
		Collections.sort(list1);
		System.out.println(list1);
		
		for (int i = list1.get(0); i < list1.get(list1.size()-1); i++) {
			
			if (!list1.contains(i)) {
				System.out.println(i);
			}
			
		}
	}

}
