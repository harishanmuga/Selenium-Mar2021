package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// web element of frame
		WebElement frameEntry = driver.findElement(By.id("iframeResult"));
		
		// enter into the frame
		driver.switchTo().frame("iframeResult"); // frame(string as nameorId)
		//driver.switchTo().frame(frameEntry);   // frame(webelement)
		
		// click on button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// switching into alert
		Alert alert = driver.switchTo().alert();
		
		// alert has been accepted
		alert.accept();
		
		// getting text after handled alert
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(text);
		
		// exit from the frame
		driver.switchTo().defaultContent();
		
		
		

	}

}
