package Systemtest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mainclassforsystemtest {
	public static WebDriver driver;
@BeforeTest
	public void OpenBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String browser=SystemTestcase.readData("Sheet1",2,10);
		String url=SystemTestcase.readData("Sheet1", 2, 0);
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void CloseBrowser()
	{
driver.close();
}
	@BeforeClass
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String un=SystemTestcase.readData("Sheet2", 2, 1);
		String psd=SystemTestcase.readData("Sheet2", 2, 2);
		driver.findElement(By.name("ctl00$cphSection$ucLogin$txtUserName")).sendKeys(un);
		driver.findElement(By.name("ctl00$cphSection$ucLogin$txtPassword")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterClass
	public void logout() {
		driver.findElement(By.className("logoutImg")).click();
	}
}

