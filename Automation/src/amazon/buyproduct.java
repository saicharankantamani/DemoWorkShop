package amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class buyproduct extends AmazonBaseClass{
	@Test
	public void buyProduct() throws IOException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung m30s mobiles");
		driver.findElement(By.className("nav-input")).click();
		String s1=driver.getWindowHandle();
		System.out.println(s1);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy M30s (Sapphire Blue, 4GB RAM, Super AMOLED Display, 64GB Storage, 6000mAH Battery)']")).click();
		for(String a: driver.getWindowHandles()) {
			 driver.switchTo().window(a);
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.id("submit.add-to-cart")).click();
			EventFiringWebDriver e1=new EventFiringWebDriver( driver);
			File f1=e1.getScreenshotAs(OutputType.FILE);
			File f2=new File("C:\\ScreenShot\\addcart1.jpg");
			FileUtils.moveFile(f1, f2);
		
	}

}
