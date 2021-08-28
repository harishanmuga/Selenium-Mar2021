package practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Frame
		driver.switchTo().frame(0);
		WebElement clickButton = driver.findElement(By.id("Click"));
		clickButton.click();
		String text = clickButton.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		
		// nested frame
		driver.switchTo().frame(1);
		// number of frame
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No. of frame inside outer frame: "+size);
		if (size>0) {
			driver.switchTo().frame(0);
			WebElement clickButton1 = driver.findElement(By.id("Click1"));
			clickButton1.click();
			String text2 = clickButton1.getText();
			System.out.println(text2);
			driver.switchTo().defaultContent();
		}
		
		
	}

}
