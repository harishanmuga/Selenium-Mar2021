package week3.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("src")).sendKeys("C");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN,Keys.ENTER,Keys.TAB);
		
		driver.findElement(By.id("dest")).sendKeys("B");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("dest")).sendKeys(Keys.DOWN,Keys.ENTER);
		
		driver.findElement(By.xpath("//table[contains(@class,'rb-monthTable')]//tr/td[text()='31']")).click();
		
		//driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		//driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[1]/td[3]")).click();
		
		//Thread.sleep(5000);
		
		//driver.findElement(By.id("//table[@class='rb-monthTable first last']/tbody/tr[3]/td[text()='1']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("search_btn")).click();

		Thread.sleep(10000);
		//table[@class='rb-monthTable first last']/tbody/tr/td[text()='Apr 2021']
		
		System.out.println("Total count :"+driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//input[@id='bt_SLEEPER']/parent::li/label)[2]")).click();
		
		System.out.println("Sleeper bus count :"+driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='bt_AC']/parent::li/label")).click();
		
		System.out.println("Sleeper with AC bus count :"+driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='fare d-block']//span"));
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 1; i < list.size(); i++) {
			
			String text = list.get(i).getText();
			
			int parseInt = Integer.parseInt(text);
			
			intList.add(parseInt);		
		}
		
		Collections.sort(intList);
		
		Integer max = Collections.max(intList);
		
		System.out.println(max);
		
		
		
	}

}
