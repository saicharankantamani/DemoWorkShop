package orangehrm;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClaassOrangehrm {
	public static WebDriver driver;

	@BeforeTest
	
	public void Openbrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+)
		driver=new ChromeDriver();
		driver.get(arg0);
		
		
	}

}
