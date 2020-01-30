package week1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import userdefinedclasses.BaseClass;

public class Program4 extends BaseClass{
	@Test
	public void Program4() throws AWTException
	{
		WebElement w1=driver.findElement(By.linkText("Work Schedule"));
		Actions a1=new Actions(driver);
		a1.contextClick(w1).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_RIGHT);
		
		r1.keyPress(KeyEvent.VK_ENTER);
			}

}
