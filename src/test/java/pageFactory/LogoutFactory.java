package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutFactory {
	WebDriver driver;
	
	
	public LogoutFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using ="//input[@name='txtUsername']")

	WebElement user_name;
	public WebElement LoUserName() {
		return user_name;
	}
	
	
	@FindBy(how=How.ID, using ="txtPassword")
	@CacheLookup
	WebElement Password_user;
	public WebElement EnterPassword() {
		return Password_user;
	}
	
	@FindBy(how=How.XPATH, using ="//*[@id='btnLogin']")
	@CacheLookup
	WebElement CL;
	public WebElement Clicklogin() {
		return CL;
	}
	
	
	@FindBy(how=How.ID, using ="welcome")
	@CacheLookup
	WebElement cwa;
	public WebElement ClickWelcomeAdmin() {
		return cwa;
	}
	

	
	
	
	
	public void ClickonAdmin() {
driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		
		
}
	
	public void clickLogout() {
		//ExplicitWait
		 WebDriverWait w= new WebDriverWait(driver, 10);
			WebElement el= w.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Logout"))));
			el.click();
			
		
	}
	
	
	

}//end class
