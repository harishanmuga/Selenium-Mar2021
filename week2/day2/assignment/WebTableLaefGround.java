package week2.day2.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.mk_latn.No;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableLaefGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//h5[text()='Table']/following-sibling::img")).click();
		
		// Number of Rows
		
		List<WebElement> tabRows = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr"));
		
		int rowSize = tabRows.size();
		
		System.out.println("No. of Rows: "+rowSize);
		
		// Number of Columns
		
		List<WebElement> tabCol = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/th"));
		
		System.out.println("No. of columns: "+tabCol.size());
		
		String input = "Learn to interact with Elements";
		
		// Progressive value of 'Learn to interact with elements
		
		WebElement proValue = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[3]/td[2]"));
		
		System.out.println(proValue.getText());
		/*
		WebElement table = driver.findElement(By.xpath("//table[@id='table_id']/tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rows.size()-1; i++) {
			System.out.println(rows.get(i).getText());
			
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			
			String text = col.get(2).getText();
			
			System.out.println(text);
			
		}*/
		
		driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[4]/td[3]")).click();
		
		/*	
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/td[2]"));
		
		for (int i = 0; i <= findElements.size()-1; i++) {
			String text = findElements.get(i).getText();
			String replace = text.replace("%", "");
			System.out.println(replace);
			
		}*/
		
		}

	}


