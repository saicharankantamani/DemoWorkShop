package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver c=new ChromeDriver();
c.get("http://kumar:81/login.do");
c.findElement(By.name("username")).sendKeys("admin");
c.findElement(By.name("pwd")).sendKeys("manager");
c.findElement(By.xpath("//input[@type='submit']")).click();
Dimension d1=new Dimension(500, 500);
c.manage().window().setSize(d1);
c.navigate().forward();
c.navigate().refresh();
c.findElement(By.xpath("//input[@type='button']")).click();
//c.navigate().back();
c.manage().window().maximize();
c.findElement(By.name("customerId")).click();
String t=c.findElement(By.className("pagetitle")).getText();
System.out.println(t);
String s=c.findElement(By.linkText("Completed Tasks")).getText();
System.out.println(s);

	}

}
