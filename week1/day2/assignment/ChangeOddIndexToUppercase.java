package week1.day2.assignment;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "gamechanger";
		char[] charArray = text.toCharArray();
		
		for (int i = 0; i <= charArray.length-1; i++) {
			
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
			}else {
				System.out.print(charArray[i]);
			}
		}
	}

}
