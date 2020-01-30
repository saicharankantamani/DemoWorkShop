package vtiger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import userdefinedclasses.ExcelOperation;

public class BaseClassvtiger {
	
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String browser=ExcelOperation.readData("Sheet4",1,3);
		String url=ExcelOperation.readData("Sheet4", 1, 0);
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
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
		String un=ExcelOperation.readData("Sheet4", 1, 1);
		String psd=ExcelOperation.readData("Sheet4", 1, 2);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(psd);
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterClass
	public void logout() throws InterruptedException {
	
		WebElement w1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();	
	Thread.sleep(10000);
		driver.findElement(By.linkText("Sign Out")).click();
		
	}
	
	
}
