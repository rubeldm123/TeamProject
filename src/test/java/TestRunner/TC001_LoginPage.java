package TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001_LoginPage {
	WebDriver driver;
	@Test()
	public void OpeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubel\\Documents\\work\\git\\TeamProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		
	}
	

}
