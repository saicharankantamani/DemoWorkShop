package exceloperations;

import java.awt.List;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create5users extends Exceloperations{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		int rowcount=Exceloperations.getRowcount("Sheet5");
		System.out.println(rowcount);
		int cellcount=Exceloperations.getcellcount("Sheet5",1);
		System.out.println(cellcount);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://kumar:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Users")).click();
		for(int i=1;i<rowcount;i++)
		{
			driver.findElement(By.xpath("//input[@value='Add New User']")).click();
			java.util.List<WebElement> a1=driver.findElements(By.xpath("//input[@type='text']"));
			for(int j=0;j<cellcount;j++)
			{
			a1.get(j).sendKeys(Exceloperations.readData("Sheet5", i, j));		
			}
			driver.findElement(By.name("passwordText")).sendKeys("123456789");
			driver.findElement(By.name("passwordTextRetype")).sendKeys("123456789");
				driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
				
			}
		driver.findElement(By.className("logoutImg")).click();
		driver.close();
		}
		

	}
