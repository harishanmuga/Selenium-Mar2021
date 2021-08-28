package week3.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		/* wait to disappear
		WebElement waitDisappear = driver.findElement(By.xpath("//h5[text()='Wait to Disappear']"));
		
		waitDisappear.click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//b[text()='I'm going to disappear. Keep looking at me!!']")));
		
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Button is disappeared')]")));
		
		String text = driver.findElement(By.xpath("//strong[contains(text(),'Button is disappeared')]")).getText();
		
		System.out.println(text);
		
		
		// wait to appear
		
		driver.findElement(By.xpath("//h5[text()='Wait to Appear']")).click();
		
		WebElement appElement = driver.findElement(By.xpath("//button[@id='btn']/b"));
		
		wait.until(ExpectedConditions.visibilityOf(appElement));
		
		System.out.println(appElement.getText());
		*/
		
		// wait for text change
		driver.findElement(By.xpath("//h5[text()='Wait for Text Change']")).click();
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Click ME!']"));
		
		wait.until(ExpectedConditions.visibilityOf(button));
		
		System.out.println(button.getText());
		
		
		

	}

}
