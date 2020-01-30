package orangehrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadProperties {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//charan.properties");
		Properties p=new Properties();
		p.load(fis);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
String s=	driver.get(p.getProperty(url));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("Users")).click();
	driver.findElement(By.xpath("//input[@type='button']")).click();
	driver.findElement(By.name("username")).sendKeys("saicharan5");
	driver.findElement(By.name("passwordText")).sendKeys("saicharan");
	driver.findElement(By.name("passwordTextRetype")).sendKeys("saicharan");
	WebElement s1=driver.findElement(By.name("active"));
	Select s=new Select(s1);
	s.selectByIndex(1);
	driver.findElement(By.name("firstName")).sendKeys("kantamani");
	driver.findElement(By.name("lastName")).sendKeys("kumar");
	driver.findElement(By.name("middleName")).sendKeys("sai");
	driver.findElement(By.name("email")).sendKeys("saicharankantamani@gmail.com");
	driver.findElement(By.name("phone")).sendKeys("9100369692");
	driver.findElement(By.name("mobile")).sendKeys("8008220105");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	String s2=driver.findElement(By.className("successmsg")).getText();
	System.out.println(s2);

	}

}
