package week1.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String text1 = "stops";
	String text2 = "potss2";
	int count = 0;
	
	// condition to verify length of the given strings
	if (text1.length()==text2.length()) {
		System.out.println("Given words ~ Having same length so please proceed further..!!");
			//Strings are converted to array
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			// Arrays sorted
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
				// traverse through array and verifying same value or not
				for (int i = 0; i < charArray2.length-1; i++) {
					if (charArray[i]==charArray2[i]) {
						System.out.println(charArray[i]+" = "+charArray2[i]);
					}else {
						System.out.println(charArray[i]+" != "+charArray2[i]);
						count++;
				
					}
				}
				if (count>0) {
					System.out.println("Given words "+text1+","+text2+" are NOT ANAGRAM");
				} else {
					System.out.println("Given words "+text1+","+text2+" are ANAGRAM");
				}
	// Not same length ~given strings
	} else {
		System.err.println("Length of given words are different. Found as NOT ANAGRAM");
	}
	
	}

}
