package actiTime;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import userdefinedclasses.BaseClass;

public class WindowHandel {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
	ChromeDriver c=new ChromeDriver();
	c.get("http://kumar:81/login.do");
	c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	c.findElement(By.name("username")).sendKeys("admin");
	c.findElement(By.name("pwd")).sendKeys("manager");
	c.findElement(By.xpath("//input[@type='submit']")).click();
	c.findElement(By.linkText("Reports")).click();
	String s1=c.getWindowHandle();
	c.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
	Set<String> a1=c.getWindowHandles();
	for(String a:a1)
	{
		c.switchTo().window(a);
		if(c.getTitle().contains("Calendar"))
		{
			c.findElement(By.className("calendarCurrentMonthWorkingDay")).click();
		}
	}
	c.switchTo().window(s1);
	System.out.println(s1);
}
	

}
