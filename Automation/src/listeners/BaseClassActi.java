package listeners;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClassActi {
public class log {

	}
public static WebDriver driver;
public static Logger log;
@BeforeTest
public void OpenBroser()
{
	log=Logger.getLogger(BaseClassActi.class);
	PropertyConfigurator.configure("log4j.properties");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver/chromedriver.exe");
	driver=new ChromeDriver();
	log.info("*********browser opened*****");
	driver.get("http://kumar:81/login.do");
	log.info("url entered");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("admin");
	
	log.info("un enetered");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	log.info("pwd entered");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
@AfterTest
public void close()
{
	driver.close();
}

}
