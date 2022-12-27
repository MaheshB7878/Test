package msexcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genric 
{
	WebDriver driver;
	@BeforeMethod
	public void appopen()
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
