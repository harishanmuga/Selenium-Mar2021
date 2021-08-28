package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@When("click on CRM\\/SFA")
	public void clickOnCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then("MyHome page launched")
	public void myHomePageLaunched() {
	    System.out.println("Launched Home");
	}
}
