package week1.day1.assignment;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer obj = new Computer();
		obj.brandName();
		int capacity = obj.capacity();
		System.out.println("RAM is "+capacity+" GB");
		char logoLetter = obj.logoLetter();
		System.out.println("Letter is "+logoLetter);
		
	}

}
