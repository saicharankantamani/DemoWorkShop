package PageFrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import userdefinedclasses.BaseClass;

public class ActiveProjectsandCustomers {
	
	@FindBy(xpath ="//input[@value='Add New Customer']")
	private WebElement AddNewCustomerButton;
	@FindBy(className = "successmsg")
	private WebElement retriveSucessmsg;
	public ActiveProjectsandCustomers()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void clickOnAddNewCustomerButton()
	{
		AddNewCustomerButton.click();
	}
	public String retrivesucessmessage()
	{
		return retriveSucessmsg.getText();
	}
}
