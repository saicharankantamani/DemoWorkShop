package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class User extends BaseClassActi{

	@Test
	public void Createuser() throws InterruptedException {
		driver.findElement(By.linkText("Users")).click();
	driver.findElement(By.xpath("//input[@value='Add New User']")).click();
	driver.findElement(By.name("username")).sendKeys("dadvavcfahfv");
	driver.findElement(By.name("passwordText")).sendKeys("123456789");
	driver.findElement(By.name("passwordTextRetype")).sendKeys("123456789");
	driver.findElement(By.name("firstName")).sendKeys("umar");
	driver.findElement(By.name("lastName")).sendKeys("vb");
	driver.findElement(By.name("mobile")).sendKeys("94562654555");
	driver.findElement(By.name("rightGranted[9]")).click();
	driver.findElement(By.name("rightGranted[1]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@value='Create User']")).click();
	String actres=driver.findElement(By.className("pagetitle")).getText();
	System.out.println(actres);
//Assert.assertTrue(false);
			
	}
}
