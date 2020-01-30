package PageFrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import userdefinedclasses.BaseClass;

public class OpenTasks {
	@FindBy(linkText = "Projects & Customers")
	private WebElement ProjectsandCustomerslink;
	public OpenTasks()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void ClickonProjectsandCustomerslink()
	{
		ProjectsandCustomerslink.click();
	}

}
