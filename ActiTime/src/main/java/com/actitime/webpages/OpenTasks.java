package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.testbase.BaseClass;

public class OpenTasks {
	public Logger log;
	@FindBy(linkText = "Projects & Customers")
	private WebElement projectandcustomerslink;
	public OpenTasks()
	{
		PageFactory.initElements(BaseClass.driver, this);
		log=Logger.getLogger(AddNewCustomer.class);
		PropertyConfigurator.configure("log4j.Properties");
	}
	public void clickonpandc() {
		log.info("click on prrojects and customers link");
		projectandcustomerslink.click();
		
		}

}
