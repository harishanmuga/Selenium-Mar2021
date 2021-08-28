package practice.oopsconcept;

public class LookOfVehicle extends Asthetics{

	@Override
	public void priorityOnLook(int priority) {
		System.out.println("Priority on look: "+priority);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LookOfVehicle obj = new LookOfVehicle();
		
		obj.priorityOnLook(5);
		obj.impNotice();
		
	}

	

}
