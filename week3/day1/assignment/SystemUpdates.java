package week3.day1.assignment;

public class SystemUpdates implements Hardware,Software {

	public String softwareResource() {
		// TODO Auto-generated method stub
		return "Yes, Software is in up-do-date..!";
	}

	public String hardwareResources() {
		// TODO Auto-generated method stub
		return "Yes, Hardwares are working as expected.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SystemUpdates obj = new SystemUpdates();
		
		System.out.println(obj.hardwareResources());
		
		System.out.println(obj.softwareResource());

	}


}
