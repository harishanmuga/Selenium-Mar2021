package week2.day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String LoginTitle = driver.getTitle();
		
		System.out.println(LoginTitle);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("PayPal");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("HariSaha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd = new Select(eleSource);
		
		dd.selectByVisibleText("Cold Call");
		
		WebElement eleMktCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dd1 = new Select(eleMktCamp);
		
		dd1.selectByValue("CATRQ_AUTOMOBILE");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String createLeadTitle = driver.getTitle();
		
		System.out.println(createLeadTitle);	
		
		
	}

}
