package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	public WebDriver ldriver;
	public LoginPageObject(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement txtuserName;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement clickSubmit;
	
	
	//for userName;
	public void setUserName(String uname) {
		txtuserName.sendKeys(uname);
	}
	
	//password;
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	//click on Login button
	public void ClickOnSubmitButton() {
		clickSubmit.click();	
	}
	
	
	

}
