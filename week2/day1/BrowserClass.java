package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set up chrome driver by using webdrivermanager
		WebDriverManager.chromedriver().setup();
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps");
		
		// maximize the window
		driver.manage().window().maximize();
	}

}
