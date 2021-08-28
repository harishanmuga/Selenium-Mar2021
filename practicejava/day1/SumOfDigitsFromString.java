package practicejava.day1;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = (int) (Math.random()*100);
		System.out.println(random);
		
		String text = "Tes12Le79af65";
		
		String digit = text.replaceAll("\\D", "");
		System.out.println(digit);
		
		char[] x = digit.toCharArray();
		
		int sum = 0;
		
		
		for (int i = 0; i < x.length; i++) {
			int y = Character.getNumericValue(x[i]);
			sum = sum+y;
		}
		
		System.out.println(sum);
		
	}

}
