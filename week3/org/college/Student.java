package week3.org.college;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name: HARI");
	}
	
	public void studentDept() {
		System.out.println("Student department: Mechanical");
	}
	
	public void studentId() {
		System.out.println("Student ID: 124563");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();
		
		obj.collegeCode();
		
		System.out.println("College name: "+obj.collegeName("Govt College"));
		
		obj.collegeRank();
		
		obj.deptName();
		
		obj.studentName();
		
		obj.studentDept();
		
		obj.studentId();
		
		

	}

}
