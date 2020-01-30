package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyMobile {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login & Signup")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9100369692");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8008220105");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
@Test
public void testbuyproduct()
{
	WebElement w=driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions a=new Actions(driver);
	a.moveToElement(w).perform();
	driver.findElement(By.linkText("Samsung")).click();
	String s=driver.getWindowHandle();
	driver.findElement(By.linkText("Samsung Galaxy A70s (Prism Crush Black, 128 GB)")).click();
for(String c:driver.getWindowHandles())
{
	driver.switchTo().window(c);
}
	driver.findElement(By.linkText("6 GB")).click();
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
@AfterTest
public void logout()
{
	WebElement e=driver.findElement(By.xpath("//div[text()='KANTAMANI']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e).perform();
	driver.findElement(By.xpath("//div[text()='Logout']")).click();
}
}
