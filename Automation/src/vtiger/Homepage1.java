package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	@FindBy(linkText = "Organizations")
private WebElement OrganizationLink;
	@FindBy(linkText = "Opportunities")
	private WebElement Opportunities;
	@FindBy(linkText = "Products")
	private WebElement Products;
	@FindBy(xpath = "//img[@src='themes/softed/images/mainSettings.PNG']")
	private WebElement SettingsButton;
public Homepage1()
{
	PageFactory.initElements(BaseClassvtiger.driver, this);
}
public void clickOnOrganizationLink()
{
	OrganizationLink.click();
	
}
public void clickOnOpportunities() {
	Opportunities.click();
	
}
public void clickOnProducts()
{
	Products.click();
}
public void CliconSettings()
{  
	Actions a1=new Actions(BaseClassvtiger.driver);
	a1.moveToElement(SettingsButton).perform();
BaseClassvtiger.driver.findElement(By.linkText("CRM Settings")).click();
}
}
