package UseCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InfoNetStatusCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://103.58.117.3/customer_portal/account/INFONET");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ICEPPMPPM658");
		
		driver.findElement(By.id("password")).sendKeys("8148745090");
		
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::span)[1]")).click();

	}

}
