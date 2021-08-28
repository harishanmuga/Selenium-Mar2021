package practicejava.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "changename";
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (i%2==0) {
				System.out.print(charArray[i]);
			}else {
				String text = Character.toString(charArray[i]);
				String upperCase = text.toUpperCase();
				System.out.print(upperCase);
			}
		}
	}

}
