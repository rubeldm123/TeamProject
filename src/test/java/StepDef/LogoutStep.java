package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFactory.LogoutFactory;

public class LogoutStep {
	WebDriver driver;
	LogoutFactory log;

	@Given("^Admin Navigate to HRM Loginpage$")
	public void admin_Navigate_to_HRM_Loginpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubel\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
	  
	 
	}

	@When("^Admin Entervalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void admin_Entervalid_and(String arg1, String arg2) throws Throwable {
		log=new LogoutFactory(driver);
		log.LoUserName().sendKeys(arg1);
		log.EnterPassword().sendKeys(arg2);
	
	}
	
	@When("^click on LOGINButton$")
	public void click_on_LOGIN_Button() throws Throwable {
		log=new LogoutFactory(driver);
		log.Clicklogin().click();
		
		
	
	}
	@When("^Admin will Land in AdminHomePage$")
	public void admin_will_Land_in_AdminHomePage() throws Throwable {
		System.out.println("Welcome to homePage");
	
	}

	@When("^click on WelcomeAdmin andclick on Logout$")
	public void click_on_WelcomeAdmin_andclick_on_Logout() throws Throwable {
		log=new LogoutFactory(driver);
		log.ClickonAdmin();
		log.clickLogout();
		
		
		
			
		
		
		
		//driver.findElement(By.linkText("Logout")).click();
	
	}

	@Then("^Close TheBrowser$")
	public void close_TheBrowser() throws Throwable {
		//driver.quit();
	
	}
	
}//end class
