package actiTime;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import userdefinedclasses.BaseClass;
import userdefinedclasses.ExcelOperation;

public class Newuser extends BaseClass
{
	@Test
	public void  testnewuser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String un=ExcelOperation.readData("Sheet2", 1, 3);
		String psd=ExcelOperation.readData("Sheet2", 1, 4);
		String rpsd=ExcelOperation.readData("Sheet2", 1, 5);
		String fsn=ExcelOperation.readData("Sheet2", 1, 6);
		String lsn=ExcelOperation.readData("Sheet2", 1, 7);
		long mob=ExcelOperation.numreadData("Sheet2", 1, 8);
		String expres=ExcelOperation.readData("Sheet2", 1, 9);
		
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.xpath("//input[@value='Add New User']")).click();
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("passwordText")).sendKeys(psd);
			driver.findElement(By.name("passwordTextRetype")).sendKeys(psd);
			driver.findElement(By.name("firstName")).sendKeys(fsn);
			driver.findElement(By.name("lastName")).sendKeys(lsn);
			driver.findElement(By.name("mobile")).sendKeys(mob+"");
			driver.findElement(By.name("rightGranted[9]")).click();
			driver.findElement(By.name("rightGranted[1]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@value='Create User']")).click();
			String actres=driver.findElement(By.className("pagetitle")).getText();
			System.out.println(actres);
			ExcelOperation.writeData("Sheet2", 1, 10, actres);
		if(expres.equals(actres))
		{
			ExcelOperation.writeData("Sheet2", 1, 11, "pass");
		}
		else 
		{
			ExcelOperation.writeData("Sheet2", 1, 11, "fail");
		}
		System.out.println("closing");
		Thread.sleep(2000);
			
		}
		
}
