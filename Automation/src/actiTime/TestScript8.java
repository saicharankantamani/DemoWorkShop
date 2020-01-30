package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://kumar:81/login.do");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type='submit']")).click();
		c.findElement(By.linkText("Users")).click();
		c.findElement(By.xpath("//input[@type='button']")).click();
		c.findElement(By.name("username")).sendKeys("saicharan5");
		c.findElement(By.name("passwordText")).sendKeys("saicharan");
		c.findElement(By.name("passwordTextRetype")).sendKeys("saicharan");
		WebElement s1=c.findElement(By.name("active"));
		Select s=new Select(s1);
		s.selectByIndex(1);
		c.findElement(By.name("firstName")).sendKeys("kantamani");
		c.findElement(By.name("lastName")).sendKeys("kumar");
		c.findElement(By.name("middleName")).sendKeys("sai");
		c.findElement(By.name("email")).sendKeys("saicharankantamani@gmail.com");
		c.findElement(By.name("phone")).sendKeys("9100369692");
		c.findElement(By.name("mobile")).sendKeys("8008220105");
		c.findElement(By.xpath("//input[@type='submit']")).click();
		String s2=c.findElement(By.className("successmsg")).getText();
		System.out.println(s2);
			}

}
