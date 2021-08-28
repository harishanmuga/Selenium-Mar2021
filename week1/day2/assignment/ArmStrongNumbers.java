package week1.day2.assignment;

public class ArmStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int org = 153;
		int input = org;
		int sum = 0;
				
		while(input>0) {
			int rem = input%10;
			sum = sum+(rem*rem*rem);
			input = input/10;
			
		}
		System.out.println(sum);
		
		if(sum==org) {
			System.out.println("Given number "+org+" is an ARMSTRONG number");
		}else {
			System.out.println("Given number "+org+" is NOT an ARMSTRONG number");
		}
						
	}

}
