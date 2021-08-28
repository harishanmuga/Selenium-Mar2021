package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String LoginTitle = driver.getTitle();
		
		System.out.println(LoginTitle);
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElementByLinkText("Create Account").click();
		
		driver.findElement(By.id("accountName")).sendKeys("Savings");
		
		driver.findElement(By.name("parentPartyId")).sendKeys("democlass1");
		
		driver.findElement(By.id("groupNameLocal")).sendKeys("Software Pvt Ltd");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("INDIA");
		
		driver.findElement(By.id("annualRevenue")).sendKeys("20000000");
		
		WebElement eleindustry = driver.findElementByName("industryEnumId");
		
		Select dd = new Select(eleindustry);
		
		dd.selectByVisibleText("Computer Software");
		
		WebElement eleowner = driver.findElement(By.name("ownershipEnumId"));
		
		Select dd1 = new Select(eleowner);
		
		dd1.selectByValue("OWN_PROPRIETOR");
		
		driver.findElementById("sicCode").sendKeys("XYZ001");
		
		WebElement elesource = driver.findElementById("dataSourceId");
		
		Select dd2 = new Select(elesource);
		
		dd2.selectByIndex(2);
		
		WebElement eleteam = driver.findElementById("initialTeamPartyId");
		
		Select dd3 = new Select(eleteam);
		
		dd3.selectByValue("DemoSalesTeam1");
		
		driver.findElementById("numberEmployees").sendKeys("1000");
		
		driver.findElement(By.id("tickerSymbol")).sendKeys("SAHA");
		
		WebElement elemktcamp = driver.findElement(By.id("marketingCampaignId"));
		
		Select dd4 = new Select(elemktcamp);
		
		dd4.selectByVisibleText("Affiliate Sites");
		
		driver.findElement(By.name("importantNote")).sendKeys("NA");
		
		driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("505");
		
		driver.findElement(By.id("primaryPhoneExtension")).sendKeys("0240");
		
		driver.findElement(By.id("primaryEmail")).sendKeys("abcdef@uu.com");
		
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("9516487236");
		
		driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Varman");
		
		driver.findElement(By.id("primaryWebUrl")).sendKeys("https://software.com");
		
		driver.findElement(By.id("generalToName")).sendKeys("Hari");
		
		driver.findElement(By.id("generalAddress1")).sendKeys("Palliplayam");
		
		driver.findElement(By.id("generalCity")).sendKeys("Erode");
		
		driver.findElement(By.id("generalPostalCode")).sendKeys("411");
		
		driver.findElement(By.id("generalPostalCodeExt")).sendKeys("0202");
		
		driver.findElement(By.id("generalAttnName")).sendKeys("NA");
		
		driver.findElement(By.id("generalAddress2")).sendKeys("NA");
		
		WebElement elestate = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select dd5 = new Select(elestate);
		
		dd5.selectByVisibleText("Alabama");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		
		
	}
}
