package learn.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select dd = new Select(element);
		dd.selectByVisibleText("Selenium");
		WebElement element1 = driver.findElement(By.id("dropdown2"));
		Select dd1 = new Select(element1);
		dd1.selectByIndex(3);
		WebElement element2 = driver.findElement(By.id("dropdown3"));
		Select dd2 = new Select(element2);
		dd2.selectByValue("4");
		System.out.println(dd2.getOptions());

	}

}
