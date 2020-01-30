package amazon;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonBuy {
	public static WebDriver driver;
	//public static void main(String[] args) throws InterruptedException, IOException {
	@BeforeTest
	public void OpenBroser()
	{
		 
		//c.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void Login() throws InterruptedException {
		WebElement w=driver.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		Actions a1=new Actions((WebDriver) driver);
		a1.moveToElement(w).perform();
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9100369692");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("8008220105");
		driver.findElement(By.id("signInSubmit")).click();
	}
	@Test
	public void testselectproduct() throws IOException
	{
		//c.findElement(By.id("continue")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung m30s mobiles");
		driver.findElement(By.className("nav-input")).click();
		String s1=((RemoteWebDriver) driver).getWindowHandle();
		System.out.println(s1);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy M30s (Sapphire Blue, 4GB RAM, Super AMOLED Display, 64GB Storage, 6000mAH Battery)']")).click();
		//String S=c.findElement(By.xpath("//span[@text()='Samsung Galaxy M30s (Sapphire Blue, 4GB RAM, Super AMOLED Display, 64GB Storage, 6000mAH Battery)']")).getText();
	//Set<String> s2=c.getWindowHandles();
	for(String a:((RemoteWebDriver) driver).getWindowHandles()) {
		((RemoteWebDriver) driver).switchTo().window(a);
		//if(c.getCurrentUrl().contains("https://www.amazon.in/Test-Exclusive-628/dp/B07HGMQX6N/ref=sr_1_1_sspa?crid=3CZP0OCGP71NH&keywords=samsung+m30s+mobiles&qid=1576773841&smid=A1EWEIV3F4B24B&sprefix=sam%2Caps%2C307&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFJSlFWT0hNM0FPU1MmZW5jcnlwdGVkSWQ9QTA4OTAzODYxVTlBRTNCVVBWNjZWJmVuY3J5cHRlZEFkSWQ9QTA1NzE0NTgzVTZTWFVRM1U5UzFHJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ=="))
				}
	System.out.println(((RemoteWebDriver) driver).getTitle());
	driver.findElement(By.id("submit.add-to-cart")).click();
		EventFiringWebDriver e1=new EventFiringWebDriver((WebDriver) driver);
		File f1=e1.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\ScreenShot\\addcart.jpg");
		FileUtils.moveFile(f1, f2);
	}
	@AfterMethod
	public void closebrowser()
	{
		((WebDriver) driver).close();
	}
	
	}

				

