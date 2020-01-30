package week1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://www.primevideo.com");
		c1.navigate().forward();
		c1.navigate().forward();
		c1.navigate().refresh();
		c1.navigate().back();
		Dimension d1=new Dimension(500,500); 
		c1.manage().window().setSize(d1);
		c1.manage().window().maximize();
		c1.close();
	}

}
