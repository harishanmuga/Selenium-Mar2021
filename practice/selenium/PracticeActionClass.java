package practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeActionClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		 * // drag and drop on driver.get("http://leafground.com/pages/drag.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * element = driver.findElement(By.id("draggable")); Point location =
		 * element.getLocation(); System.out.println(location); Actions builder = new
		 * Actions(driver); builder.clickAndHold(element).dragAndDropBy(element, 100,
		 * 50).release().perform(); driver.close();
		 */
		
		/*
		 * // drag and drop driver.get("http://leafground.com/pages/drop.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Actions
		 * builder = new Actions(driver); WebElement drag =
		 * driver.findElement(By.id("draggable")); WebElement drop =
		 * driver.findElement(By.id("droppable")); builder.dragAndDrop(drag,
		 * drop).perform();
		 */
		
		// Mouse hover
		driver.get("http://leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@class='btnMouse']"));
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Selenium']"));
		Actions builder = new Actions(driver);
		// builder.contextClick(element).perform();
		builder.moveToElement(element).click(element2).perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
