package week1.day2;

public class Loop {
	
	/*
	 * i = 1 (iteration starting point)
	 * i = 50 (iteration ending point)
	 * i%2 == 0 is even number
	 */
	
	public void loopMethod(int max) {
		for (int i = 1; i <= max; i++) {
			
			if(i%2==0) {
				System.out.println("Given number "+i+" is even");
			}
			
		}
	}
	
	
public static void main(String[] args) {
	
	Loop obj = new Loop();
	obj.loopMethod(50);
}
}
