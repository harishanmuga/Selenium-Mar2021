package week1.day2.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hari9726TN";
		int sum = 0;
		String replacetext = text.replaceAll("\\D", "");
		System.out.println("Only digits in string: "+replacetext);
		
		char[] charArray = replacetext.toCharArray();
		int arrlen = charArray.length;
		System.out.println("Length of replaced string is ==> "+arrlen);
		for (int i = 0; i <= arrlen-1; i++) {
			int num = Character.getNumericValue(charArray[i]);
			sum = sum+num;
		}
		
		System.out.println("Output ==> "+sum);

	}

}
