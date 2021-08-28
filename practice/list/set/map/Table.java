package practice.list.set.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement eleFrom = driver.findElement(By.id("txtStationFrom"));
		eleFrom.clear();
		eleFrom.sendKeys("MGR C",Keys.DOWN,Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Bengaluru",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainNo = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]/a"));
		List<Integer> listInt = new ArrayList<Integer>();
		
		for (WebElement webElement : trainNo) {
			String text = webElement.getText();
			int parseInt = Integer.parseInt(text);
			listInt.add(parseInt);	
		}
		//Collections.sort(listInt);
		
		// Display train no without duplicates
		Set<Integer> setInt = new LinkedHashSet<Integer>();
		for (Integer each : listInt) {
			setInt.add(each);
		}
		for (Integer each : setInt) {
			System.out.println(each);
		}
		
		System.out.println("*******************");
		
		List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a"));
		List<String> listTrainName = new ArrayList<String>();
		
		for (WebElement each : trainName) {
			String text = each.getText();
			listTrainName.add(text);
		}
		System.out.println("sddddsdds");
		Map<Integer,String> trainMap = new LinkedHashMap<Integer,String>();
		
		for (int i = 0; i < listInt.size(); i++) {
			trainMap.put(listInt.get(i), listTrainName.get(i));
		}
		
		for (Entry<Integer, String> each : trainMap.entrySet()) {
			System.out.println(each);
		}
		
		System.out.println("*****");
		
		System.out.println(trainMap.containsValue("YPR FESTVL SPL"));
	}

}
