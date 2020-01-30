package Brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		/*driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
        List<WebElement> links= driver.findElements(By.tagName("a"));
        for(int i=0;i<links.size();i++)
        {
        	String s=links.get(i).getAttribute("href");
        	verfiylink(s);
        	
        }
		
	}
	public static void verfiylink(String link) throws IOException
	{
		URL url=new URL(link);
		HttpURLConnection rv1= (HttpURLConnection)url.openConnection();
		rv1.connect();
		if(rv1.getResponseCode()==200)
		{
			System.out.println(link+" "+rv1.getResponseMessage());
		}
		else
		{
			System.out.println(link+" "+rv1.getResponseMessage());
		}
		}

}
