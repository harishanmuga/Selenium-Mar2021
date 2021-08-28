package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare i/p string
		String companyName = "TESTLEAF";
		
		// Convert string to character array
		char[] charArray = companyName.toCharArray();
		
		// declare a set with data type integer as set does not allow duplicates
		Set<Character> unique = new HashSet<Character>();
		
		// tracerse through character array
		for (int i = 0; i < charArray.length; i++) {
			
			// adding each value to set if duplicate occurs execute block of code
			if(unique.add(charArray[i])) {
				System.out.print(charArray[i]);
			} 
		}

	}

}
