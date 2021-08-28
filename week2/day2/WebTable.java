package week2.day2;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//img[@alt='Table']")).click();
		
		List<WebElement> tabRows = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr"));
		
		System.out.println("No. of the rows in given table "+tabRows.size());
		
		List<WebElement> allMentor = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/td[5]"));
		
		for (WebElement eachMentor : allMentor) {
			System.out.println(eachMentor.getText());
		}
		
		File snap = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		
		File dest  = new File("snap1.png");
		
		FileUtils.copyFile(snap, dest);
		
		
		
		
		
		
		
		
	}
}
