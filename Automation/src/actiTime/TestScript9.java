package actiTime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("http://kumar:81/login.do");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@type='submit']")).click();
		c.findElement(By.linkText("Reports")).click();
		WebElement w1=c.findElement(By.name("users"));
		Select s1=new Select(w1);
		if(s1.isMultiple())
		{
			System.out.println("multi selected");
		}
		else
		{
		System.out.println("not multi selected");
		}
		List<WebElement> a1=s1.getOptions();
		for(int i=0;i<a1.size();i++)
		{
String s2=a1.get(i).getText();
System.out.println(s2);
}
		int i=s1.getOptions().size();
		System.out.println("no of options are"+i);
		for(int j=0;j<s1.getOptions().size();j++)
{
s1.selectByIndex(j)	;
}
		/*s1.selectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		s1.selectByIndex(4);
		s1.selectByIndex(5);*/
		s1.deselectAll();
		for(int j=0;j<s1.getOptions().size();j=j+2)
		{
		s1.selectByIndex(j);
		}
	s1.deselectAll();
	for(int j=0;j<s1.getOptions().size();j++)
	{
	s1.selectByIndex(j)	;
	}
	for(int j=s1.getOptions().size()-1;j>=0;j--)
	{
		s1.deselectByIndex(j);
	}
	c.findElement(By.className("logoutImg")).click();
	c.close();
	
}
}
