package vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrganizationsButton;
	@FindBy(name = "accountname")
	private WebElement OrganizationsTextfield;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement Savebutton;
	public Organizations()
	{
		PageFactory.initElements(BaseClassvtiger.driver, this);
	}
	public void clickoncreateOrganizationsButton()
	{
		createOrganizationsButton.click();
	}
	public void entercreateOrganizationName(String OrganizationsName)
	{
		OrganizationsTextfield.sendKeys(OrganizationsName);
	}
	public void clickOnSavebutton()
	{
		Savebutton.click();
	}

}
