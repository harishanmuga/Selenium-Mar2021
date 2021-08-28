package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("email")).sendKeys("abcedf@uu.com");
		
		// append text pending
		
		String text = driver.findElement(By.name("username")).getAttribute("value");
		
		System.out.println(text);
		
		
		//clear text pending
		
		// disabled check pending
		
		// button actions
		
		/*	
		driver.findElement(By.linkText("Button")).click();
		
		driver.findElement(By.linkText("Go to Home Page"));
		
		driver.findElement(By.linkText("Button")).click();
		
		Point location = driver.findElement(By.linkText("Get Position")).getLocation();
		
		System.out.println(location);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		
		System.out.println(size);
		*/
		
		

	}

}
