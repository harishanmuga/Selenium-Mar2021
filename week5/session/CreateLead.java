package week5.session;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{

	
	@Test(dataProvider = "sendData")
	public void createLeadUseCase(String cName, String fName, String lName) {
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	driver.findElement(By.name("submitButton")).click();
}
	
	// dynamic data passing through parameterization
	/*
	 * @DataProvider(name="fetchData") public String[][] sendData() {
	 * 
	 * String[][] data = new String[2][3];
	 * 
	 * data[0][0] = "Testleaf"; data[0][1] = "Hari"; data[0][2] = "R";
	 * 
	 * data[1][0] = "HCL"; data[1][1] = "Saha"; data[1][2] = "S";
	 * 
	 * return data; // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
	@DataProvider
	public String[][] sendData() throws IOException {
		// TODO Auto-generated method stub
		
		return ReadExcel.excelRead();

	}
}






