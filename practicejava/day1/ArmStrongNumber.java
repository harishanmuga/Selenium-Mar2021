package practicejava.day1;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int org = 153;
		
		int input = org;
		
		int sum = 0;
		
		while(input>0) {
			int r = input%10;
			//int rc = (int) Math.pow(r, 3);
			//System.out.println(rc);
			sum = sum+(int)Math.pow(r, 3);
			input=input/10;
			
		}
		
		if (org==sum) {
			
			System.out.println("Given number is armstrong");
			
		} else {
			System.out.println("Given number is not armstrong");
		}

	}

}
