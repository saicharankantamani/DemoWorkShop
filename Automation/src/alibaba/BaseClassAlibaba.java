package alibaba;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassAlibaba {
	public static WebDriver driver;
	public void OpenBrowser()
	{
		System.setProperty( "webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.alibaba.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void login()
	{
		
	}
	

}
