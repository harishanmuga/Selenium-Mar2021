package week3.day1;

public class Myphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samsung android = new Samsung();
		
		System.out.println("Android version is: "+android.versionAndroid());
		
		android.supportedBrands();
		
		System.out.println("Feature of touch display: "+android.touchDisplay(true));
		
		Oneplus oxygen = new Oneplus();
		
		oxygen.brandName();
		
		System.out.println("oxygen version is: "+oxygen.versionOxygen());

	}

}
