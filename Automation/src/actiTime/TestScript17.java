package actiTime;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://kumar:81/login.do");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		c.findElement(By.linkText("Reports")).click();
		String s1=c.getWindowHandle();
		System.out.println(s1);
		c.findElement(By.xpath("//img[@src='/img/default/calendar/cal.gif']")).click();
		Set<String> s2 = c.getWindowHandles();
		System.out.println(s2);
		for(String a:s2)
		{
			c.switchTo().window(a);
		

			if(c.getTitle().contains("calendar"))
			{
				
				c.manage().window().maximize();
				
				c.findElement(By.xpath("//span[text()='30']")).click();
				break;
			}
			c.switchTo().window(s1);
			c.findElement(By.className("logoutImg")).click();
		}
	}

}
