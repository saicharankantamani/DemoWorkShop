package vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Productspage {
	@FindBy(xpath = "//img[@alt='Create Product...']")
	private  WebElement ProductButton;
	@FindBy(name = "productname")
	private WebElement ProductNameTextfield;
	@FindBy(name = "productcategory")
	private WebElement ProductCategoryDropdown;
	@FindBy(name = "manufacturer")
	private WebElement ManufacturerDropdown;
	public void clickOnnewProductButton()
	{
		ProductButton.click();
	}
	public void enterproductName(String ProductName)
	{
		ProductNameTextfield.sendKeys(ProductName);
	}
	public void selectProductCategoryDropdown(String Category)
	{
		Select s1=new Select(ProductCategoryDropdown);
		s1.selectByVisibleText(Category);
	}
	public void selectManufacturerDropdown(int index)
	{
		Select s2=new Select(ManufacturerDropdown);
		s2.selectByIndex(index);
	}
	}
