package week2.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//h5[text()='Drop down']/following-sibling::img")).click();
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select dd1 = new Select(element1);
		
		dd1.selectByIndex(1);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		
		Select dd2 = new Select(element2);
		
		dd2.selectByVisibleText("Appium");
		
		WebElement element3 = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		
		Select dd3 = new Select(element3);
		
		dd3.selectByValue("3");
		
		WebElement element4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		
		Select dd4 = new Select(element4);
		
		List<WebElement> options = dd4.getOptions();
		
		System.out.println("Size of the list: "+options.size());
		
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Loadrunner");
		
		driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[3]")).click();
		
		// code to get random numbers
		//int floor = (int) Math.floor(Math.random()*10);

	}

}
