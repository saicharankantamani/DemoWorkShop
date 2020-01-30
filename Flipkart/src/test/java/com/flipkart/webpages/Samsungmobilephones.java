package com.flipkart.webpages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseClassFlipkart;

public class Samsungmobilephones extends BaseClassFlipkart{
	@FindBy(linkText = "Samsung Galaxy M30s (Blue, 64 GB)")
	private WebElement M30smobile;
	public Samsungmobilephones() {
		PageFactory.initElements(BaseClassFlipkart.driver, this);
	}
	public void Clickonm30s()

	{
		String s=BaseClassFlipkart.driver.getWindowHandle();
		M30smobile.click();
		Set<String> a1=BaseClassFlipkart.driver.getWindowHandles();
		for(String a:a1)
		{
			BaseClassFlipkart.driver.switchTo().window(a);
		}
	BaseClassFlipkart.driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
}
