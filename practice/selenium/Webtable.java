package practice.selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MGR C",Keys.DOWN,Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Bengaluru",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> totalTrain = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		System.out.println(totalTrain.size());
		
		List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
		
		System.out.println(trainName.size());
		
		List<String> nameList = new ArrayList<String>();
		
		for (WebElement each : trainName) {
			String text = each.getText();
			nameList.add(text);
		}
		
		Collections.sort(nameList);
		
		for (String string : nameList) {
			
			System.out.println(string);
			
		}
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snapRail.png");
		
		FileUtils.copyFile(src, dest);
	}

}
