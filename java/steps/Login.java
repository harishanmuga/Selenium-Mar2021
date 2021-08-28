package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	/*
	 * public ChromeDriver driver;
	 * 
	 * @Given("Open the chrome browser") public void openBrower() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * }
	 * 
	 * @Given("Launch the Leaf taps application") public void launchURL() {
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 * 
	 */	
	@Given("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
	}
	
	@When("click on login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be launched successfully")
	public void verfiryHomePage() {
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Navigated to homePage successfully");
		}
	}
	
	/*
	 * @Then("close the browser") public void closeBrowser() { driver.close();
	 * 
	 * }
	 */
	
	@But("Homepage should not be launched successfully")
	public void VerifyError() {
		System.out.println("Login failed.");

	}
}
