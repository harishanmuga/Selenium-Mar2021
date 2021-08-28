package week3.day2.assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		
//		get the length of the array		
		System.out.println("Length of the array: "+input.length);

//		sort the array			
		Arrays.sort(input);

//		Iterate it in the reverse order
		for (int i = input.length-1; i >= 0; i--) {
			System.out.println(input[i]);
		}
		
		// Sorting using list
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		
		Collections.sort(list);
		
		System.out.println("********");
		
		for (String string : list) {
			System.out.println(string);
		}
		

		

//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
