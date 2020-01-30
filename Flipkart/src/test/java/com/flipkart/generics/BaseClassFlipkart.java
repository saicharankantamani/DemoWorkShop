package com.flipkart.generics;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClassFlipkart {
	public static WebDriver driver;
	public Logger log;
	@BeforeTest
	public void Openbrowser() throws EncryptedDocumentException, IOException
	{
	String url=FlipkartExcelOperations.readdata("Sheet1", 1, 0);
	log=Logger.getLogger(BaseClassFlipkart.class);
	PropertyConfigurator.configure("log4j.properties");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+"//drivers/chromedriver.exe"));
	driver=new ChromeDriver();
	log.info("***************Browser opened*************");
	driver.get(url);
	log.info("****************url entered************");
	}
	@BeforeClass
	public void Login() throws EncryptedDocumentException, IOException {
		String un=FlipkartExcelOperations.readdata("Sheet1", 1, 1);
		String psd=FlipkartExcelOperations.readdata("Sheet1", 1, 2);
		driver.findElement(By.linkText("Login")).click();
		log.info("********login button clicked*********");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		log.info("*****************user name entered*******");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psd);
		log.info("******************password entered*****************");
		driver.findElement(By.xpath("//span[@text()='Login']")).click();
		log.info("*****************clicked on login button");
	}
	@AfterClass
	public void logout()
	{
		log.info("**************click on logout button***************");
	}
	@AfterTest
	public void close() {
		driver.close();
		log.info("************browser  closed");
	}
}
