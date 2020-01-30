package vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	@FindBy(linkText ="Leads")
private WebElement leadbutton;
	public Homepage()
	{
		PageFactory.initElements(BaseClassvtiger.driver,this);
	}
public void selectleadbutton() {
	
	leadbutton.click();
	

}
}
