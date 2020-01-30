package parabank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://parabank.parasoft.com/parabank/index.htm");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
c.findElement(By.name("username")).sendKeys("a");
c.findElement(By.name("password")).sendKeys("a");
c.findElement(By.xpath("//input[@value='Log In']")).click();
c.findElement(By.linkText("Open New Account")).click();
WebElement w1=c.findElement(By.id("type"));
Select s1=new Select(w1);
s1.selectByIndex(1);
WebElement w2=c.findElement(By.id("fromAccountId"));
Select s2=new Select(w2);
s2.selectByIndex(0);
c.findElement(By.className("button")).click();
String q=c.findElement(By.id("rightPanel")).getText();
System.out.println(q);
c.findElement(By.linkText("Transfer Funds")).click();
c.findElement(By.id("amount")).sendKeys("200");
Thread.sleep(2000);
WebElement w3=c.findElement(By.id("fromAccountId"));
Select s3=new Select(w3);
s3.selectByIndex(0);
WebElement w4=c.findElement(By.id("toAccountId"));
Select s4=new Select(w4);
s4.selectByIndex(1);
c.findElement(By.className("button")).click();
String s5=c.findElement(By.className("title")).getText();
System.out.println(s5);
	}

}
