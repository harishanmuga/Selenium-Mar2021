package week1.day2;

import java.util.Arrays;

public class LearnArray {
	
	public static void main(String[] args) {
		
		/*
		 * getting input array
		 * sorting an array
		 * printing the sorted array list
		 * find the duplicate number by using for loop
		 */
		
		int[] input = {2,5,3,7,2,7,1,8};
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			if (input[i]==input[i+1]) {
				System.out.println("Given number is a duplicate "+input[i]);
				break;
			}
		}
}
}
