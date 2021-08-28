package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "madam";
		char[] charArray = text.toCharArray();
		String rev = "";
		
		
		for (int i = charArray.length-1; i >= 0 ; i--) {
			//System.out.println(charArray[i]);
			String string = Character.toString(charArray[i]);
			rev = rev+string;
		}
		System.out.println(rev);
		
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("Given word "+text+" is a PALINDROME");
		}else {
			System.out.println("Given word "+text+" is NOT a PALINDROME");
		}
	}

}
