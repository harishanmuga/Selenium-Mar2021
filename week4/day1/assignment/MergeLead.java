package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		
		driver.findElement(By.partialLinkText("Leads")).click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Merge Leads']")).click();
		
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("No. of windows: "+windowHandles.size());
		
		List<String> listWindows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindows.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10012");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")));
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		driver.switchTo().window(listWindows.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		System.out.println("No. of windows: "+windowHandles2.size());
		
		List<String> listWindows2 = new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(listWindows2.get(1));
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10011");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		
		driver.switchTo().window(listWindows2.get(0));
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10011");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']"));
		
		wait.until(ExpectedConditions.visibilityOf(findElement));
		
		boolean displayed = findElement.isDisplayed();
		
		if(!displayed) {
			System.out.println("No records found - Expected");
		}
	
	}

}
