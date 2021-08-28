package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem 1
		 * create input as string
		 * split the string by words and stored into array
		 * reverse the array of string
		 *
		 */
		
		String input = "Amazon Development Center";
		String[] split = input.split(" ");
		char[] charArray = input.toCharArray();
		
		for (int i = split.length-1; i >= 0; i--) {
			
			System.out.print(split[i]+" ");
			
		}
		
		System.out.println();
		
		/*
		 * Problem 2
		 * create input as string
		 * convert string to array
		 * reverse the array of character
		 *
		 */
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();

		System.out.println(input.length());
		System.out.println(input.contains("k"));
		System.out.println(input.indexOf('z'));
		System.out.println(input.lastIndexOf('a'));
		System.out.println(input.charAt(5));
		
		String text = "Amazon";
		System.out.println(input.equals(text));
		System.out.println(input.startsWith(text));
		System.out.println();
		String lowerCase = input.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(input.equalsIgnoreCase(lowerCase));
		
		String empid = "1345600";
		System.out.println(Integer.parseInt(empid));
		
		String isActive = "false";
		System.out.println(isActive.valueOf(true));
	}

}
