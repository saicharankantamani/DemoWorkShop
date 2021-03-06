package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.testbase.BaseClass;

public class Loginpage extends BaseClass {
	
	@FindBy(name="username")
private WebElement un;
	@FindBy(name="pwd")
	private WebElement psd;
	@FindBy(css="input[type='submit']")
	private WebElement loginnow;
	public  Loginpage()
	{
		PageFactory.initElements(BaseClass.driver, this);
		log=Logger.getLogger(AddNewCustomer.class);
		PropertyConfigurator.configure("log4j.Properties");
	}
	public void login()
	{
		/*un.sendKeys(pro.getProperty("un"));
		un.sendKeys("admin");
		psd.sendKeys(pro.getProperty("pwd"));*/
		log.info("enter username");
		un.sendKeys("admin");
		log.info("enter password");
		psd.sendKeys("manager");
		log.info("click on login");
		loginnow.click();
		
	}
	}
