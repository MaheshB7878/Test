package demo2;

import org.testng.annotations.Test;

public class Sample extends Generic
{
	 @Test()
     public void test1()
     {
     driver.get("https://www.facebook.com/");
     }   
	 @Test()
     public void test2()
     {
     driver.get("https://www.amzon.com/");
     }  
	 @Test()
     public void test3()
     {
     driver.get("https://www.flipkart.com/");
     }  
}
