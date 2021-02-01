package com.demoewebshop.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utlis.TestBase;

public class HomePage extends TestBase{
	
	
	
	@FindBy(xpath = "//a[text()='Log in']")
	public WebElement loginLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginLink() {
		loginLink.click();
	}

}
