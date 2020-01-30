package com.actitime1.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime1.generics.BaseClass;



public class OpenTasks extends BaseClass{
	public Logger log;
	@FindBy(linkText = "Projects & Customers")
	private WebElement ProjectsandCustomerslink;
	public OpenTasks()
	{
		PageFactory.initElements(BaseClass.driver, this);
		log=Logger.getLogger(OpenTasks.class);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void ClickonProjectsandCustomerslink()
	{
		ProjectsandCustomerslink.click();
		log.info("******************clickd on projects and customers link******");
	}
}
