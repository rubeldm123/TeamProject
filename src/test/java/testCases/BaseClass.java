package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilitiesClass.ReadConfig;

public class BaseClass {
	ReadConfig rc=new ReadConfig();
	public String baseURL=rc.getPortalURL();
	public String uname="Admin";
	public String pass="admin123";
	public static WebDriver driver;
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		
	if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", rc.getChromepath());
			driver = new ChromeDriver();
			System.out.println("1.Driver open Successfully ");
			
	}		
	
			
	}//end of setup method
	
	@AfterClass
	public void teardown() {
		driver.close();
		
		System.out.println("7. Browser close successfully");
	}//end of teardown

	

}//end class
