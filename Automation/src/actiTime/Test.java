package actiTime;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static ChromeDriver driver;
String url=
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);

	}

}
