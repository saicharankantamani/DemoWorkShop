package com.flipkart.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineShoppingsite {
	@FindBy(xpath = "//span=[@text()='Electronics']")
private WebElement Electronics;
	@FindBy(linkText = "Samsung")
	private WebElement Samsungbutton;
}
