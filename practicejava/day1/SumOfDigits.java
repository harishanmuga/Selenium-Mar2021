package practicejava.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 153;
		
		int input = n;
		
		int sum = 0;
		
		while(input>0) {
			int r = input%10;
			sum = sum+r;
			input = input/10;
			
		}
		
		System.out.println("sum of 153 is: "+sum);

	}

}
