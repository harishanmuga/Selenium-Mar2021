package week3.day1.assignment;

public class OverLoadingExample {

	public void getStudentInfo(String name) {
		System.out.println("Studen name: "+name);
	}
	
	public void getStudentInfo(int id) {
		System.out.println();
	}
	
	public void getStudentInfo(long num) {
		System.out.println("Studen phone number: "+num);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadingExample obj = new OverLoadingExample();
		
		obj.getStudentInfo("Hari");
		
		obj.getStudentInfo("123456");
		
		obj.getStudentInfo(" 8148745090");
		
	}

}
