package week3.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// element created for sort on date check box
		WebElement sortOnDateChkbox = driver.findElement(By.xpath("//td[@id='tdDateOnly']/input"));
		
		sortOnDateChkbox.click();
		
		// From station element
		WebElement stationFrom = driver.findElement(By.id("txtStationFrom"));
		
		stationFrom.clear();
		
		stationFrom.sendKeys("MGR",Keys.DOWN,Keys.DOWN,Keys.ENTER);
		
		//To station element
		WebElement stationTo = driver.findElement(By.id("txtStationTo"));
		
		stationTo.clear();
		
		stationTo.sendKeys("KSR",Keys.DOWN,Keys.ENTER);
		
		// List of train names as web element
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]"));
		
		int size = trainNames.size();
		
		System.out.println("No. of trains: "+size);
		
		// String of list initiated
		List<String> strOfNames = new ArrayList<String>();
		
		for (int i = 0; i < size; i++) {
			// Text of web element stored into string
			String text = trainNames.get(i).getText();
			
			// String added into list of string
			strOfNames.add(text);
			
			//System.out.println(text);
		}
		
		System.out.println("***************");
		
		// Sorting list of string
		Collections.sort(strOfNames);
		
		// Printing each train name after sort
		for (String string : strOfNames) {
			System.out.println(string);
		}
		
		Set<String> orgList = new HashSet<String>();
		
		for (int i = 0; i < strOfNames.size(); i++) {
			
			orgList.add(strOfNames.get(i));
			
		}
		
		System.out.println("***************Assignment 3************");
		
		for (String string : orgList) {
			
			System.out.println(string);
			
		}
		
		System.out.println("Size:"+orgList.size());
		
		
		
		
		

	}

}
