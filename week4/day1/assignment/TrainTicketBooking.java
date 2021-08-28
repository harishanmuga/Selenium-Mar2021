package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']//following::label[text()='FLIGHTS']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		List<String> listWind = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWind.get(1));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[contains(@class,'block-nav-right d-none')]//a)[3]"))));
		
		String text = driver.findElement(By.xpath("//div[@class='container']/div/div[2]/a")).getText();
		
		System.out.println("Customer care email-id: "+text);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
