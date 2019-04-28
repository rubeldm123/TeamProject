import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testMethod {

	public static void main(String[] args) {
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrubel\\Documents\\work\\git\\TeamProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("Admin");

	}

}
