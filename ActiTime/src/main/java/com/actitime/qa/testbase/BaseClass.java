package com.actitime.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.webpages.AddNewCustomer;

public class BaseClass {
	public static WebDriver driver;
	public Logger log;
	public Properties pro;
	/*public void OpenBrowser() throws IOException {
		FileInputStream fis =new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\ActiTime\\src\\main\\java\\com\\actitime\\qa\\config\\config.properties");
		 pro=new Properties();
		pro.load(fis);
	}*/
	public void intialise()
	{log=Logger.getLogger(AddNewCustomer.class);
	PropertyConfigurator.configure("log4j.Properties");
		System.setProperty("webdriver.chrome.driver","C://drivers/chromedriver.exe");
		driver=new ChromeDriver();
		log.info("open browser");
		driver.get("http://127.0.0.1:81/login.do");
		log.info("enter url");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	public void logout()
	{
		log.info("click on logout");
		driver.findElement(By.className("logoutImg")).click();
	}
public void close()
{
	log.info("close browser");
	driver.close();
}
}