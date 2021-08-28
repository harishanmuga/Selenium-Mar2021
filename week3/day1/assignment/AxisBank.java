package week3.day1.assignment;

public class AxisBank extends BankInfo{

	//@Overridden
	public String deposit() {
		return "Axis bank is best option to create deposit account";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj = new AxisBank();
		
		System.out.println(obj.saving());
		obj.fixed();
		System.out.println(obj.deposit());
	}
	

}
