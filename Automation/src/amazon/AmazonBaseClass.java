package amazon;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import userdefinedclasses.ExcelOperation;

public class AmazonBaseClass {
	public static WebDriver driver;
	@BeforeTest
	public static void OpenBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		driver =new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@BeforeClass
public void Login() throws InterruptedException {
		WebElement w=driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(w).perform();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9100369692");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("8008220105");
		driver.findElement(By.id("signInSubmit")).click();
	}
	@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
