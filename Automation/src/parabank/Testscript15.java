package parabank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://parabank.parasoft.com/parabank/index.htm");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
c.findElement(By.name("username")).sendKeys("a");
c.findElement(By.name("password")).sendKeys("a");
c.findElement(By.xpath("//input[@value='Log In']")).click();
c.findElement(By.linkText("Update Contact Info")).click();
c.findElement(By.id("customer.firstName")).clear();
c.findElement(By.id("customer.lastName")).clear();
c.findElement(By.id("customer.address.street")).clear();
c.findElement(By.id("customer.address.city")).clear();
c.findElement(By.id("customer.address.state")).clear();
c.findElement(By.id("customer.address.zipCode")).clear();
c.findElement(By.id("customer.phoneNumber")).clear();
c.findElement(By.id("customer.firstName")).sendKeys("kumar1");
c.findElement(By.id("customer.lastName")).sendKeys("kantamani1");
c.findElement(By.id("customer.address.street")).sendKeys("kovvur1");
c.findElement(By.id("customer.address.city")).sendKeys("Hyderabad");
c.findElement(By.id("customer.address.state")).sendKeys("AndhraPradesh");
c.findElement(By.id("customer.address.zipCode")).sendKeys("534350");
c.findElement(By.id("customer.phoneNumber")).sendKeys("91003696921");
c.findElement(By.className("button")).click();
//String s1=c.findElement(By.xpath("//p[text()='Your updated address and phone number have been added to the system. ']")).getText();	
c.findElement(By.linkText("Log Out")).click();
c.close();
}

}
