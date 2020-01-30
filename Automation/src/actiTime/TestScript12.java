package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://kumar:81/login.do");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type='submit']")).click();
		c.findElement(By.linkText("Projects & Customers")).click();
		c.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c.findElement(By.name("name")).sendKeys("bmw");
		c.findElement(By.linkText("Open Tasks")).click();
		String s=c.findElement(By.id("DiscardChangesButton")).getAttribute("value");
	System.out.println(s);
	String s1=c.findElement(By.id("RemainOnThePageButton")).getAttribute("value");
	System.out.println(s1);
	c.findElement(By.id("DiscardChangesButton")).click();
	c.findElement(By.className("logoutImg")).click();
	c.close();
	}

}
