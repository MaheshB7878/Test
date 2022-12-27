package msexcel;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Assignment extends Genric
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
	 FileInputStream fis = new FileInputStream("./excel/testdata.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("sheet1");
	Row r = sh.getRow(1);
	Cell c = r.getCell(0);
	Row r1 = sh.getRow(1);
	Cell c1 = r.getCell(1);
	String value = c.toString();
	String value1 = c1.toString();
	System.out.println(value);
	System.out.println(value1);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys(value);
	Thread.sleep(2000);
	driver.findElement(By.name("pass")).sendKeys(value1);
	driver.findElement(By.name("login")).click();
	
	
}
}
