package week1.day2.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 567;
		int sum = 0;
		
		while(input>0) {
			int rem = input%10;
			//System.out.println(rem);
			sum = sum+rem;
			//System.out.println(sum);
			input = input/10;
			
		}
		
		System.out.println(sum);
	}

}
