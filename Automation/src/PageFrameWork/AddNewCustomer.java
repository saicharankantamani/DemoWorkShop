package PageFrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import userdefinedclasses.BaseClass;
import userdefinedclasses.ExcelOperation;

public class AddNewCustomer {
	@FindBy(name = "name")
	private WebElement CustomerNameTestField;
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomerSubmitbutton;
	
	public AddNewCustomer() {
PageFactory.initElements(BaseClass.driver, this);
	}
	public void entercustomernae(String cn)
	{
		
		CustomerNameTestField.sendKeys(cn);
		
	}
	
	public void clickcreateCustomerSubmit()
	{
		createCustomerSubmitbutton.click();
	}

}
