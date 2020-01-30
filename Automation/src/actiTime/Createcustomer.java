package actiTime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import userdefinedclasses.ExcelOperation;

public class Createcustomer {
	@Test
	public void testcreatecstomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
String url=ExcelOperation.readData("Sheet1", 1, 0);
String un=ExcelOperation.readData("Sheet1", 1, 1);
String pwd=ExcelOperation.readData("Sheet1", 1, 2);
String cn=ExcelOperation.readData("Sheet1", 1, 3);
String exp=ExcelOperation.readData("Sheet1", 1, 4);
System.out.println(exp);
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver c=new ChromeDriver();
c.get(url);
c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
c.findElement(By.name("username")).sendKeys(un);
c.findElement(By.name("pwd")).sendKeys(pwd);
c.findElement(By.xpath("//input[@type='submit']")).click();
c.findElement(By.linkText("Projects & Customers")).click();
c.findElement(By.xpath("//input[@value='Add New Customer']")).click();
c.findElement(By.name("name")).sendKeys(cn);
Thread.sleep(2000);
c.findElement(By.name("createCustomerSubmit")).click();
String act  =c.findElement(By.className("successmsg")).getText();  
System.out.println(act);
ExcelOperation.writeData("Sheet1", 1, 5, act);
if(exp.equals(act)){
	ExcelOperation.writeData("Sheet1", 1, 6, "pass");
}
else
{
	ExcelOperation.writeData("Sheet1", 1, 6, "fail");
}
System.out.println("before close");
c.close();
}
}
