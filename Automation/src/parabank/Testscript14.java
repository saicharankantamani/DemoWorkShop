package parabank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://parabank.parasoft.com/parabank/index.htm");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.linkText("Register")).click();
		c.findElement(By.id("customer.firstName")).sendKeys("kumar1");
		c.findElement(By.id("customer.lastName")).sendKeys("kantamani1");
		c.findElement(By.id("customer.address.street")).sendKeys("kovvur1");
		c.findElement(By.id("customer.address.city")).sendKeys("Hyderabad");
		c.findElement(By.id("customer.address.state")).sendKeys("AndhraPradesh");
		c.findElement(By.id("customer.address.zipCode")).sendKeys("534350");
		c.findElement(By.id("customer.phoneNumber")).sendKeys("91003696921");
		c.findElement(By.id("customer.ssn")).sendKeys("1234561");
		c.findElement(By.id("customer.username")).sendKeys("saicharan1");
		c.findElement(By.id("customer.password")).sendKeys("1234561");
		c.findElement(By.id("repeatedPassword")).sendKeys("1234561");
		c.findElement(By.className("button")).click();
		c.findElement(By.linkText("Log Out")).click();
		c.findElement(By.name("username")).sendKeys("saicharan1");
		c.findElement(By.name("password")).sendKeys("1234561");
		c.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
