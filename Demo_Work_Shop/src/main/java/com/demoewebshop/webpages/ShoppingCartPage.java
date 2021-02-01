package com.demoewebshop.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utlis.TestBase;

public class ShoppingCartPage extends TestBase{
	public static String quantity = "5";
	LoginPage loginPage;
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr/td[1]")
	private List<WebElement> removeItemsCheckbox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateCartButton;
	
	@FindBy(xpath = "//div[@class='order-summary-content']")
	private WebElement cartEmptymsg;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement termsofservicesCheckBox;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOutButton;
	
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	/*public String emptyMsg() {
		return cartEmptymsg.getText();
	}*/
	public static void addBooks() {
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Books']")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']//a[normalize-space()='Computing and Internet']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@itemprop='price']")).getText());	
		driver.findElement(By.xpath("//input[@name='addtocart_13.EnteredQuantity']")).clear();
		driver.findElement(By.xpath("//input[@name='addtocart_13.EnteredQuantity']")).sendKeys(quantity);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
	}
	
	
	public String clearCartItems() throws InterruptedException {
		     loginPage = new LoginPage();
		     String qty = loginPage.getCartQuantity();
		     qty = qty.substring(1, qty.length()-1);
		if(qty.equalsIgnoreCase("0")) {
			 System.out.println("Cart is Empty Proceding without clearing cart");
			 ShoppingCartPage.addBooks();
			 return driver.findElement(By.xpath("//p[@class='content']")).getText();
		}
		else {
			loginPage.clickOnShoppingCartLink();
			for (WebElement remove : removeItemsCheckbox) {
				remove.click();
			}
			updateCartButton.click();
			System.out.println(cartEmptymsg.getText());
			driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
			Thread.sleep(5000);
			ShoppingCartPage.addBooks();
			 return driver.findElement(By.xpath("//p[@class='content']")).getText();
		}
		
	}
	
	public void clickOnCheckout() {
		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		System.out.println(driver.findElement(By.xpath("//table[@class='cart-total']//tr[1]/td[2]")).getText());
		termsofservicesCheckBox.click();
		checkOutButton.click();
	}

}
