package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
c1.get("https://www.netflix.com/in/Login?nextpage=https%3A%2F%2Fwww.netflix.com%2Fbrowse");
c1.findElement(By.name("userLoginId")).sendKeys("admin");
c1.findElement(By.name("password")).sendKeys("manager");
c1.findElement(By.className("btn login-button btn-submit btn-small")).click();
	}

}
