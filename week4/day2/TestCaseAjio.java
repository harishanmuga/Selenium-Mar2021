package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseAjio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Women')]")));
		
		driver.findElement(By.xpath("//label[contains(text(),'Women')]")).click();
		
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='filter-dropdown']/select"));
		
		Select dd = new Select(sortBy);
		
		List<WebElement> options2 = dd.getOptions();
		
		System.out.println("Size of the list: "+options2.size());
		
		dd.selectByVisibleText("What's New");
		
		driver.findElement(By.xpath("//div[@class='five-grid']")).click();
		
		driver.findElement(By.xpath("//span[text()='price']")).click();
		
		driver.findElement(By.id("minPrice")).sendKeys("2500");
		
		driver.findElement(By.id("maxPrice")).sendKeys("5000");
		
		driver.findElement(By.xpath("//button[@class='rilrtl-button ic-toparw']")).click();
		
		driver.findElement(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("No. of windows: "+windowHandles.size());
		
		List<String> listWindows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindows.get(1));
		
		String actualPrice = driver.findElement(By.xpath("(//div[@class='prod-price-section ']/div)[1]")).getText();
		
		System.out.println("Original Price: "+actualPrice);
		
		String discountPrice = driver.findElement(By.xpath("//div[@class='promo-discounted-price']/span")).getText();
		
		System.out.println("Discounted Price: "+discountPrice.replaceAll("[^0-9.]", ""));
		
		String couponCode = driver.findElement(By.xpath("//div[text()='Use Code ']")).getText();
		
		System.out.println("Coupon code is: "+couponCode.replaceAll("Use Code ", ""));
		
		driver.findElement(By.xpath("//span[text()='Enter Pin-code To Know Estimated Delivery Date']")).click();
		
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("560043");
		
		driver.findElement(By.xpath("//button[@class='edd-pincode-modal-submit-btn']")).click();
		
		boolean displayed = driver.findElement(By.xpath("//li[text()='Expected Delivery: ']/span")).isDisplayed();
		
		if(displayed) {
			System.out.println(driver.findElement(By.xpath("//li[text()='Expected Delivery: ']/span")).getText());
		}
		
		driver.findElement(By.xpath("//div[@class='other-info-toggle']")).click();
		
		String customerCareAdd = driver.findElement(By.xpath("//div[text()='Customer Care Address']/parent::div/div[3]")).getText();
		
		System.out.println("Customer Care Address: "+customerCareAdd);
		
		driver.findElement(By.xpath("//div[@class='btn-gold']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='btn-cart']")));
		
		//driver.findElement(By.xpath("//div[@class='btn-cart']")).click();
		
		//driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		driver.findElement(By.xpath("//div[text()='PROCEED TO BAG']")).click();
		
		String ordTtlAmt = driver.findElement(By.xpath("//section[@id='orderTotal']//span[contains(text(),'Rs')]")).getText();
		
		System.out.println("Total amount before apply coupon: "+ordTtlAmt.replaceAll("[^0-9.]", ""));
		
		driver.findElement(By.id("couponCodeInput")).sendKeys("SPECIAL");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		String ordTtlAmt1 = driver.findElement(By.xpath("//section[@id='orderTotal']//span[contains(text(),'Rs')]")).getText();
		
		System.out.println("Total amount after apply coupon: "+ordTtlAmt1.replaceAll("[^0-9.]", ""));
		
		driver.findElement(By.xpath("//div[@class='product-delete']//div[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='DELETE']")).click();
		
		String confirmText = driver.findElement(By.xpath("//p[@class='empty-msg']")).getText();
		
		System.out.println(confirmText);
		
		//driver.quit();
	}

}
