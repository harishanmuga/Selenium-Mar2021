package practice.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("home")).click();
		// current window
		String win = driver.getWindowHandle();
		driver.switchTo().window(win);
		System.out.println(driver.getTitle());
		
		// handle multi window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		int size = windows.size();
		String win1 = windows.get(1);
		driver.switchTo().window(win1);
		System.out.println(driver.getTitle());
		
		// close all window except 1st window
		for (int i = 0; i < size; i++) {
			if (windows.get(i).equals(win)) {
				System.out.println("Home window");
			}else {
				driver.close();
			}
		}
		
		
		

	}

}
