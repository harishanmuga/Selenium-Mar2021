package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/Window.html");
		
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		
		// Getting all windows in set
		Set<String> windowHandles = driver.getWindowHandles();
		
		// print the no. of windows
		System.out.println("No. of windows presents on Driver: "+windowHandles.size());
		
		// pushing windows into list from set as need to access each window by using index 
		List<String> allWindows = new ArrayList<String>(windowHandles);
		
		// switching to required window by using get(index) through list
		driver.switchTo().window(allWindows.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(allWindows.get(2));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(allWindows.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		

	}

}
