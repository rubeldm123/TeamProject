package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	WebDriver driver;
	@Given("^Admin Navigate to HRM Login page$")
	public void admin_Navigate_to_HRM_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubel\\Documents\\work\\git\\TeamProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	  
	}

	@When("^Admin Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void admin_Enter_valid_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	
	}

	@When("^click on LOGIN Button$")
	public void click_on_LOGIN_Button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	
	}

	@Then("^Admin will Land in Admin HomePage$")
	public void admin_will_Land_in_Admin_HomePage() throws Throwable {
		System.out.println("You landed in Admin HomePage");
	
	}

	@Then("^Close The Browser$")
	public void close_The_Browser() throws Throwable {
	  
	  
	}

	

}//end class
