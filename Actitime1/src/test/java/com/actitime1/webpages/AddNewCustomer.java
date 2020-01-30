package com.actitime1.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime1.generics.BaseClass;


public class AddNewCustomer extends BaseClass {
	public Logger log;
	@FindBy(name = "name")
private WebElement cntextfield;
	@FindBy(name = "createCustomerSubmit")
	private WebElement SubmitButton;
	public AddNewCustomer()
	{
		PageFactory.initElements(BaseClass.driver, this);
		log=Logger.getLogger(AddNewCustomer.class);
		PropertyConfigurator.configure("log4j.Properties");
		
	}
	public void entercnname()
	{
		
		
		
		cntextfield.sendKeys("Haroon45");
		log.info("Enter customer name");
	}
	public void cliconsubmmit()
	{
		
		SubmitButton.click();
		log.info("click on Submit Button");
	}
	
}
