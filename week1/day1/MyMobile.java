package week1.day1;

public class MyMobile {
	public static void main(String[] args) {
		Mobile myMob = new Mobile();
		myMob.mobileCondition();
		boolean mobileOn = myMob.mobileOn();
		System.out.println("Mobile condition: "+mobileOn);
		System.out.println(myMob.mobileBrand());
		boolean isActive = myMob.isActive;
		System.out.println("Is mobile active: "+isActive);
		System.out.println("Mobile price: "+myMob.mobilePrice);
		
	}
}
