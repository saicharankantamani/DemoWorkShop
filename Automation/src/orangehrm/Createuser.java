package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Createuser {
	public static WebDriver driver;
	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void CreateUser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();
		WebElement w=driver.findElement(By.linkText("User Management"));
		Actions a=new Actions(driver);
		a.moveToElement(w).perform();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Jasmine Morgan");
		driver.findElement(By.id("systemUser_userName")).sendKeys("kks2261");
		driver.findElement(By.id("systemUser_password")).sendKeys("123456789");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123456789");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
