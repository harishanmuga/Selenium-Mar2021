package practice.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable notifications");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement work1 = driver.findElement(By.id("dropdown1"));
		
		Select dd1 = new Select(work1);
		
		List<WebElement> options = dd1.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
		dd1.selectByIndex(size-1);
		
		WebElement work2 = driver.findElement(By.name("dropdown2"));
		
		Select dd2 = new Select(work2);
		
		dd2.selectByVisibleText("Selenium");
		
		driver.quit();
		
	}

}
