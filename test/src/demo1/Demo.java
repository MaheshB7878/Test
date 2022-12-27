package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test(dependsOnMethods = "login")
    public void compose()
    {
    	System.out.println("composed");
    }
	@Test()
    public void login()
    {
    	Reporter.log("Loged in",true);                //we can use sysout or this repoter.log both r valid 
    }
	@Test(dependsOnMethods = "compose")
    public void sentitems()
    {
    	System.out.println("sentitems");
    }
	@Test(dependsOnMethods = "sentitems")
    public void logout()
    {
    	Reporter.log("Loged out",true);
    }
    
}
