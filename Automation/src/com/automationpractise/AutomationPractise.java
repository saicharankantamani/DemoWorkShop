package com.automationpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractise {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebElement w1=driver.findElement(By.xpath("//a[@title='Women']"));
		System.out.println(w1);
		Actions a1=new Actions(driver);
		System.out.println(a1);
		a1.moveToElement(w1).perform();
		driver.findElement(By.linkText("T-shirts")).click();
		WebElement w2=driver.findElement(By.xpath("//ul[@class='color_to_pick_list clearfix']"));
		Actions a2=new Actions(driver);
		a2.moveToElement(w2).perform();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		driver.findElement(By.linkText("Proceed to checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Proceed to checkout")).click();
		driver.findElement(By.name("email_create")).sendKeys("sai25102065539@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("kumar");
		driver.findElement(By.id("customer_lastname")).sendKeys("charan");
		driver.findElement(By.name("passwd")).sendKeys("123456");
		WebElement w3=driver.findElement(By.name("days"));
		Select s1=new Select(w3);
		s1.selectByValue("27");
		WebElement w4=driver.findElement(By.name("months"));
		Select s2=new Select(w4);
		s2.selectByIndex(12);
		WebElement w5=driver.findElement(By.id("years"));
		Select s3=new Select(w5);
		s3.selectByIndex(18);
		driver.findElement(By.id("company")).sendKeys("ajara");
		driver.findElement(By.name("address1")).sendKeys("256,road no-2,kphb");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		WebElement w6=driver.findElement(By.id("id_state"));
		Select s4=new Select(w6);
		s4.selectByIndex(10);
		driver.findElement(By.id("postcode")).sendKeys("53350");
		driver.findElement(By.id("phone_mobile")).sendKeys("13222213213153");
		driver.findElement(By.name("alias")).clear();
		driver.findElement(By.name("alias")).sendKeys("kovvuur");
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
		driver.findElement(By.className("cheque")).click();
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		String s5=driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		System.out.println(s5);
		driver.findElement(By.linkText("Sign out")).click();
		driver.close();
	}
	

}
