package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignleave {
public static ChromeDriver driver;
@BeforeTest
public void Login()
{
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
 driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
@Test
public void Assignleave() throws InterruptedException
{
	driver.findElement(By.linkText("Leave")).click();
	driver.findElement(By.linkText("Assign Leave")).click();
	driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Jasmine Morgan");
	WebElement w=driver.findElement(By.id("assignleave_txtLeaveType"));
	Select s=new Select(w);
	s.selectByIndex(3);
	driver.findElement(By.id("assignleave_txtFromDate")).click();
	driver.findElement(By.linkText("9")).click();
	driver.findElement(By.id("assignleave_txtToDate")).click();
	driver.findElement(By.linkText("15")).click();
	driver.findElement(By.id("assignBtn")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("confirmOkButton")).click();
	}
@AfterTest
public void Logout() throws InterruptedException
{
	driver.findElement(By.linkText("Welcome Admin")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
