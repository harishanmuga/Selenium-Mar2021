package practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// simple alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Simple Alert!!!");
		
		//confirmation alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		System.out.println("Confirmation Alert!!!");
		
		// prompt alert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Saha");
		alert2.accept();
		String text = driver.findElement(By.id("result1")).getText();
		System.out.println("Prompt Alert!!! - O/P: "+text);
		
		// Line break
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert alert3 = driver.switchTo().alert();
		String text2 = alert3.getText();
		alert3.accept();
		System.out.println("Line-Break-o/p: "+text2);

	}

}
