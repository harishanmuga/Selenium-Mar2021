package week1.day2.assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int range = 8;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for (int i = 1; i < range; i++) {
			
			sum = firstNum+secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;
						
		}
		
	}

}
