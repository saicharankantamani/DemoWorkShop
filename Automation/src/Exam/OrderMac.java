package Exam;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderMac {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://tutorialsninja.com/demo/");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.className("caret")).click();
		c.findElement(By.linkText("Register")).click();
		c.findElement(By.name("firstname")).sendKeys("saicharan1111");
		c.findElement(By.name("lastname")).sendKeys("kantamani1111");
		c.findElement(By.name("email")).sendKeys("charahhhkn4hhn5001@gmail.com");
		c.findElement(By.name("telephone")).sendKeys("9100369692");
		c.findElement(By.name("password")).sendKeys("123456");
		c.findElement(By.name("confirm")).sendKeys("123456");
		c.findElement(By.name("agree")).click();
		c.findElement(By.xpath("//input[@type='submit']")).click();
		c.findElement(By.linkText("Continue")).click();
		WebElement w1=c.findElement(By.linkText("Desktops"));
		Actions a1=new Actions(c);
		a1.moveToElement(w1).perform();
		c.findElement(By.linkText("Mac (1)")).click();
		System.out.println("d");
		Thread.sleep(5000);
		//c.findElement(By.xpath("//img[@alt='iMac']")).click();
		//c.findElement(By.xpath("//span[text()='Add to Cart']"));
		c.findElement(By.className("button-group")).click();
		c.findElement(By.id("button-cart")).click();
		c.findElement(By.id("cart-total")).click();
		c.findElement(By.xpath("//strong[text()=' Checkout']")).click();
		c.findElement(By.id("input-payment-firstname")).sendKeys("saicharan");
		c.findElement(By.id("input-payment-lastname")).sendKeys("kantamani");
		c.findElement(By.name("address_1")).sendKeys("kphb");
		c.findElement(By.name("city")).sendKeys("Hyderabad");
		c.findElement(By.name("postcode")).sendKeys("500072");
	WebElement w2=c.findElement(By.name("country_id"));
	Select s1=new Select(w2);
	s1.selectByVisibleText("India");
	WebElement w3=c.findElement(By.name("zone_id"));
	Select s2=new Select(w3);
	s2.selectByVisibleText("Telangana");
	c.findElement(By.id("button-payment-address")).click();
	Thread.sleep(3000);
	c.findElement(By.id("button-shipping-address")).click();
		c.findElement(By.name("comment")).sendKeys("excellent product");
		Thread.sleep(3000);
		c.findElement(By.id("button-shipping-method")).click();
		c.findElement(By.name("agree")).click();
		Thread.sleep(3000);
		c.findElement(By.id("button-payment-method")).click();
		c.findElement(By.id("button-confirm")).click();
		EventFiringWebDriver e=new EventFiringWebDriver(c);
		File f1=e.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\ScreenShot\\sucess.jpg");
		FileUtils.moveFile(f1, f2);
		Thread.sleep(3000);
		c.findElement(By.linkText("Continue")).click();
		c.findElement(By.className("dropdown-toggle")).click();
		c.findElement(By.linkText("Logout")).click();
		c.close();
		}

}
