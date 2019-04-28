package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LoginPageObject;

public class TC001_Login extends BaseClass  {
	
	
	@Test
	public void loginTest() {
		driver.get(baseURL);
		System.out.println("2.Open Browser Successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginPageObject lp=new LoginPageObject(driver);
		lp.setUserName(uname);
		System.out.println("3.UserName Enter successfully");
		lp.setPassword(pass);
		System.out.println("4.Password Enter successfully");
		lp.ClickOnSubmitButton();
		System.out.println("5.Click on Submit button successfully");
		String titel=driver.getTitle();
		System.out.println("6. Titel of this page is :" +titel);
		
		if (titel.equals("OrangeHRM")) {
			Assert.assertTrue(true);
		}
		
		else {
			System.out.println("Wrong titel");
		}		
		
	}
	
	
}
