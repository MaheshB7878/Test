package assignment;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flikart 
{

	WebDriver driver;
	@Test
	public void flipkart() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_N);
	    r.keyRelease(KeyEvent.VK_N);
	     driver.manage().window().maximize();
	     Point p = new Point(200,300);
	     driver.manage().window().setPosition(p);
	     Dimension d = new Dimension(400,500);
	     driver.manage().window().setSize(d);
	
	
	
	
	
	}
}
