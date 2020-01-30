package actiTime;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import userdefinedclasses.BaseClass;
import userdefinedclasses.ExcelOperation;

public class Customer extends BaseClass
{
	@Test
	public void testCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
	{
	String cn=ExcelOperation.readData("Sheet1", 1, 3);
	String exp=ExcelOperation.readData("Sheet1", 1, 4);
	
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(cn);
		Thread.sleep(5000);
		driver.findElement(By.name("createCustomerSubmit")).click();
	}

}
	}
}
