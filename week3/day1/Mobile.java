package week3.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone objIphone = new Iphone();
		
		System.out.println("IOS is most secure: "+objIphone.mostSecure(true));
		
		objIphone.userOpinion();
		
		System.out.println("Latest launched model in Iphone: "+objIphone.latestModelOfIphone("12 Max"));
		
		objIphone.priceRange();

	}

}
