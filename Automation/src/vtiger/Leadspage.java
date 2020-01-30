package vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Leadspage {
	@FindBy(xpath = "//img[@alt='Create Lead...']")
private WebElement CreateLeadButton;
	@FindBy(name = "lastname")
private WebElement LastNameTextField;
	@FindBy(name = "company")
private WebElement CompanyTextField;
	@FindBy(id = "mobile")
private WebElement PhoneTextField;
	@FindBy(name = "rating")
private WebElement RatingDropdown;
	@FindBy(xpath = "//input[@value='T']")
private WebElement AssignedToRadioButton;
	@FindBy(name = "assigned_user_id")
private WebElement AssignedToDropdown;
	@FindBy(name = "button")
	
private WebElement SaveButton;
	public Leadspage()
	{
		PageFactory.initElements(BaseClassvtiger.driver, this);
	}
	public void clickcreateleadbutton()
	{
		CreateLeadButton.click();
		System.out.println("click");
	}
	public void enterlastname(String lastname)
	{
		LastNameTextField.sendKeys(lastname);
	}
	public void entercompanyname(String companyname)
	{
		CompanyTextField.sendKeys(companyname);
	}
	/*public void entermobilenumber(long mobilenum)
	{
		PhoneTextField.sendKeys(mobilenum);
	}*/
	public void selectarating(String rating)
	
	{
		Select s1=new Select(RatingDropdown);
		s1.selectByVisibleText(rating);
	}
	public void selectradiobutton()
	{
		AssignedToRadioButton.click();
	}
	public void selectassignedto(String assignedto)
	{
		Select s2=new Select(AssignedToDropdown);
				s2.selectByVisibleText(assignedto);
	}
	public void clickonsavebutton()
	{
	SaveButton.click();	
	}
}
