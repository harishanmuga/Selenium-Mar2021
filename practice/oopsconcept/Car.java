package practice.oopsconcept;

public class Car extends Vehicle {

	private String number = "12345";
	
	public String getNum() {
		return number;
	}
	
	public String setNum(String number) {
		return this.number = number;
	}
	
	public void getBrand() {
		System.out.println("Toyota"); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		
		obj.vehicleType("car");
		obj.setNum("78920");
		System.out.println(obj.getNum());
		obj.getBrand();
		obj.startVehicle();
		System.out.println("Brake type: "+obj.brakeType("ABS"));

	}

}
