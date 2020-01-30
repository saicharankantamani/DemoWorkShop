package vtiger;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.google.common.io.BaseEncoding;

public class Opportunities {
	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement OpportunitiesButton;
	@FindBy(name = "potentialname")
	private WebElement OpportunityName;
	@FindBy(id = "related_to_type")
	private WebElement relatedtoDropdown;
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement AddButton;
	@FindBy(name = "sales_stage")
	private WebElement salesstageDropDown;
	@FindBy(xpath = "//input[@value='T']")
	private WebElement AssignedToradiobutton;
	@FindBy(name = "assigned_group_id")
	private WebElement AssignedToDropdown;
	//@FindBy(id = "jscal_trigger_closingdate")
   // private WebElement calandericon;
	@FindBy(name = "button")
	private WebElement savebutton;
	@FindBy(xpath = "//span[@vtrecordid='18']")
	private WebElement saicharan;
	@FindBy(linkText = "Create Invoice")
	private WebElement createinvoice;
	public Opportunities()
	{
		PageFactory.initElements(BaseClassvtiger.driver, this);
		
	}
	public void clickOnOpportunitiesButton()
	{
		OpportunitiesButton.click();
	}
	public void enterOpportunityName(String name)
	{
		OpportunityName.sendKeys(name);
	}
	public void clickkonrelatedtoDropdown(String name1)
	{
		Select s=new Select(relatedtoDropdown);
		s.selectByVisibleText(name1);
	}
	public void clickOnAddButton()
	{
		String s1=BaseClassvtiger.driver.getWindowHandle();
		AddButton.click();
	   // java.util.Set<String> a= BaseClassvtiger.driver.getWindowHandles();
	    System.out.println("vvhdvbdhbvs");
		 for(String a1:BaseClassvtiger.driver.getWindowHandles())
		BaseClassvtiger.driver.switchTo().window(a1);
		 { 
			 System.out.println("vs");
			// if(BaseClassvtiger.driver.getTitle().contains("localhost:8888/index.php"))
			 
				 System.out.println("sdsd");
			BaseClassvtiger.driver.findElement(By.linkText("ryrt")).click(); 
			 
		 }
		 BaseClassvtiger.driver.switchTo().window(s1);
		 System.out.println("vvbhvbhvbdbdvbdv");
	}
	public void clickOnsalesStagedropdown(String text)
	{
		Select s1=new Select(salesstageDropDown);
		s1.selectByVisibleText(text);
		}
	public void clickonAssignedToradiobutton()
	{
		AssignedToradiobutton.click();
	}
	public void clickonAssignedToDropdown(int index)
	{
		Select s2=new Select(AssignedToDropdown);
		s2.selectByIndex(index);
	}
	public void clickOnSaveButton()
	{
		savebutton.click();
	}
	public void saicharan()
	{
		saicharan.click();
	}
	public void clickonCreateinvoice()
	{
		createinvoice.click();
	}
}
