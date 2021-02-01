package com.demoewebshop.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utlis.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
	private WebElement welcomeNote;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@class='header-links']//a[@class='account']")
	private WebElement accountId;
	
	@FindBy(xpath = "//span[normalize-space()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath = "//span[@class='cart-qty']")
	private WebElement cartQuantity;
	
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	private WebElement logoutLink;
	
	public LoginPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	public void login() {
		emailTextField.sendKeys("atest@gmail.com");
		passwordTextField.sendKeys("123456");
		loginButton.click();
	}
	
	public String getWelcomeNote() {
		return welcomeNote.getText();
	}
	
	public String getAccountId() {
		return accountId.getText();
	}
	
	public String getCartQuantity() {
		return cartQuantity.getText();
	}
	
	public void clickOnShoppingCartLink() {
		shoppingCartLink.click();
	}
	
	public void clickOnLogoutLink() {
		logoutLink.click();
	}

}
