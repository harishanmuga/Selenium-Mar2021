package practicejava.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text= "madam";
		String rev = "";
		char[] charArray = text.toCharArray();
		
		StringBuffer s = new StringBuffer(text);
		String string2 = s.reverse().toString();
		System.out.println(string2);
		
		for (int i = charArray.length-1; i >= 0 ; i--) {
			String string = Character.toString(charArray[i]);
			rev = rev+string;
		}
		System.out.println(rev);
		
		if (text.equalsIgnoreCase(rev)) {
			System.out.println("Yes, it is a PALINDROME");
		}
	}

}
