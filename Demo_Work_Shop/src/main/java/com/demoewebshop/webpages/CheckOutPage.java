package com.demoewebshop.webpages;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demowebshop.utlis.TestBase;



public class CheckOutPage extends TestBase{
	
	@FindBy(xpath = "//select[@id='billing-address-select']")
	private WebElement billingAddressDropDown;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	private WebElement cityTextField;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	private WebElement address1TextFiled;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement zipCodeTextField;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement continueBillingAddress;
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement continueShippingAddress;
	
	@FindBy(xpath = "//input[@value='Next Day Air___Shipping.FixedRate']")
	private WebElement nextDayAirCheckBox;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethod;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement continuePaymentMethod;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement continuePaymentInformation;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;
	
	
	
	public CheckOutPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void enterBillingAddress() {
		Random random = new Random();
		Select billingAddress = new Select(billingAddressDropDown);
		billingAddress.selectByVisibleText("New Address");
		firstNameTextField.clear();
		firstNameTextField.sendKeys("Kum"+random.nextInt(9));
		lastNameTextField.clear();
		lastNameTextField.sendKeys("kuma"+random.nextInt(9));
		Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
		country.selectByValue("41");
		cityTextField.clear();
		cityTextField.sendKeys("Hyerabad");
		address1TextFiled.clear();
		address1TextFiled.sendKeys("Kphb");
		zipCodeTextField.clear();
		zipCodeTextField.sendKeys(random.nextLong()+"");
		phoneNumberTextField.clear();
		phoneNumberTextField.sendKeys(random.nextLong()+"");
		continueBillingAddress.click();
	}
	
	public String enterShippingAddress() {
		
		WebElement shippingAddressDropDown = driver.findElement(By.xpath("//select[@id='shipping-address-select']"));
		Select shippingAddress = new Select(shippingAddressDropDown);
		List<WebElement> options = shippingAddress.getOptions();
		options.get(options.size()-2).click();
		continueShippingAddress.click();
		nextDayAirCheckBox.click();
		continueShippingMethod.click();	
		continuePaymentMethod.click();
		return driver.findElement(By.xpath("//table/tbody/tr/td")).getText();
	}
	
	public String orderConformation() {
		continuePaymentInformation.click();
		confirmOrderButton.click();
		String confirmMsg = driver.findElement(By.xpath("//div[@class='title']/strong")).getText();
		System.out.println(driver.findElement(By.xpath("//ul[@class='details']/li[1]")).getText());
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		return confirmMsg;
		
	}

}
