package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
		FirefoxDriver c=new FirefoxDriver();
		c.get("http://kumar:81/login.do");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type='submit']")).click();
		c.findElement(By.linkText("Projects & Customers")).click();
		c.findElement(By.xpath("//input[@value='Add New Project']")).click();
		WebElement d=c.findElement(By.name("customerId"));
		Select s=new Select(d);
		s.selectByIndex(1);
		c.findElement(By.name("name")).sendKeys("vernal");
		c.findElement(By.name("description")).sendKeys("My fake Project name");
		c.findElement(By.name("createProjectSubmit")).click();
		String s1=c.findElement(By.className("successmsg")).getText();
		System.out.println(s1);
		c.findElement(By.className("logoutImg")).click();
		c.close();
	}

}
