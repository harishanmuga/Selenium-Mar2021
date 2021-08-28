package week4.day1.assignment;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		
		WebElement allOffer = driver.findElement(By.xpath("//span[text()='All Offers']"));
		
		WebElement casualShoes = driver.findElement(By.xpath("(//span[text()='Casual Shoes'])[1]"));
		
		builder.moveToElement(allOffer).perform();
		
		builder.click(casualShoes).perform();
		
		WebElement categoryCount = driver.findElement(By.xpath("//span[@class='category-count']"));
		
		wait.until(ExpectedConditions.visibilityOf(categoryCount));
		
		String count = categoryCount.getText();
		
		String replaceAll = count.replaceAll("[^0-9.]", "");
		
		System.out.println("Count of results: "+replaceAll);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"))).click();;
		
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-sorttype='plth']"))).click();
		
		WebElement sortByElement = driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::div"));
		
		String sortByText = sortByElement.getText();
		
		if(sortByText.equalsIgnoreCase("Price Low To High")){
			System.out.println("Result has been sorted.");
		}
		
		
		

	}

}
