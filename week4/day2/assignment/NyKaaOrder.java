package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NyKaaOrder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("SearchInputBox")).sendKeys("perfumes",Keys.ENTER);
		
		List<WebElement> prdNameList = driver.findElements(By.xpath("//div[@class='m-content__product-list__title']/h2/span"));
		
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='post-card__content-price-offer']"));
		
		System.out.println(prdNameList.size());
		
		System.out.println(priceList.size());
		
		List<String> nameList = new ArrayList<String>();
		
		for (int i = 0; i < prdNameList.size(); i++) {
			String nameText = prdNameList.get(i).getText();
			nameList.add(nameText);
			
		}
		
		System.out.println("Records: "+nameList.size());
		
		List<Integer> priceInt = new ArrayList<Integer>();

		for (int i = 0; i < priceList.size(); i++) {
			String priceText = priceList.get(i).getText();
			String replacetext = priceText.replaceAll("[^0-9.]", "");
			int price = Integer.parseInt(replacetext);
			priceInt.add(price);
		}
		
		System.out.println("Records: "+priceInt.size());
		
		Map<String,Integer> searchResult = new LinkedHashMap<String,Integer>();
		
		for (int i = 0; i < priceInt.size(); i++) {
			searchResult.put(nameList.get(i), priceInt.get(i));
		}
		
		String maxKey = null;
		int maxValue=0;
		
		for (Entry<String, Integer> eachEntry : searchResult.entrySet()) {
			//System.out.println(eachEntry);
			
			if (eachEntry.getValue()>maxValue) {
				maxKey = eachEntry.getKey();
				maxValue = eachEntry.getValue();
			}
	}
		//Actions builder = new Actions(driver);
		System.out.println("Highest price prouct details: "+maxKey+" = "+maxValue);
		//WebElement element = driver.findElement(By.xpath("//span[text()='"+maxKey+"']"));
		//System.out.println(element.getLocation());
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		//js.executeScript("window.scrollBy(1071, 700)");
		boolean displayed = driver.findElement(By.xpath("//span[text()='"+maxKey+"']")).isDisplayed();
		if (displayed) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='"+maxKey+"']"))).click();
		}
		// minimum price value
		/*
		String minKey = null;
		int minValue=maxValue;
		
		for (Entry<String, Integer> eachEntry : searchResult.entrySet()) {
			//System.out.println(eachEntry);
			
			if (eachEntry.getValue()<minValue) {
				minKey = eachEntry.getKey();
				minValue = eachEntry.getValue();
			}
	}
		System.out.println("O/P ==> "+minKey+" = "+minValue);
		
		boolean displayed = driver.findElement(By.xpath("//span[text()='"+minKey+"']")).isDisplayed();
				if (displayed) {
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='"+minKey+"']"))).click();
				}
				*/
		
	}
	

}
