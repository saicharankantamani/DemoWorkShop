package com.demowebshop.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoewebshop.webpages.CheckOutPage;
import com.demoewebshop.webpages.HomePage;
import com.demoewebshop.webpages.LoginPage;
import com.demoewebshop.webpages.ShoppingCartPage;
import com.demowebshop.utlis.TestBase;

public class BuyBookTest extends TestBase{
	public HomePage homePage;
	public LoginPage loginPage;
	public ShoppingCartPage shoppingCartPage;
	public CheckOutPage checkOutPage;
	
	
	@Test(priority = 1)
	public void loginTest() {
		homePage = new HomePage();
		loginPage = new LoginPage();
		homePage.clickOnLoginLink();
		String welcomeNote = loginPage.getWelcomeNote();
		Assert.assertEquals(welcomeNote, "Welcome, Please Sign In!");
		loginPage.login();
		String accountId = loginPage.getAccountId();
		Assert.assertEquals(accountId, "atest@gmail.com");
	}
	
	@Test(priority = 2)
	public void addProduct() throws InterruptedException {
		shoppingCartPage = new ShoppingCartPage();
		String cartSussMsg = shoppingCartPage.clearCartItems();
		System.out.println(cartSussMsg);
		Assert.assertEquals(cartSussMsg, "The product has been added to your shopping cart");
		}
	
	@Test(priority = 3)
	public void checkoutTest() {
		checkOutPage = new CheckOutPage();
		shoppingCartPage.clickOnCheckout();
		checkOutPage.enterBillingAddress();
		String checkOutMsg = checkOutPage.enterShippingAddress();
		System.out.println(checkOutMsg);
		Assert.assertEquals(checkOutMsg, "You will pay by COD");
	}
	
	@Test(priority = 4)
	public void confirmTest() {
		String msg = checkOutPage.orderConformation();
		Assert.assertEquals(msg, "Your order has been successfully processed!");
		loginPage.clickOnLogoutLink();
	}
	

}
