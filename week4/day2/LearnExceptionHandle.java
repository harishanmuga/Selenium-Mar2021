package week4.day2;

public class LearnExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		
		int y = 1;
		
		int z;
		try {
			z=x/y;
			System.out.println(z);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e); // exception name alone
			e.printStackTrace(); // exception with impact line details
		}
		
		System.out.println("Program end");
		
		
		
		

	}

}
