package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		
		String arr1[] = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list1 = new ArrayList<String>();
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}
		
		Collections.sort(list1);
		for (int i = list1.size()-1; i >=0; i--) {
			
			System.out.println(list1.get(i));
			
		}

	}

}
