package vtiger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Settings {
	@FindBy(linkText = "Currencies")
	private WebElement Currencies;
	@FindBy(xpath = "//input[@value='New Currency']")
	private WebElement NewCurrency;
	@FindBy(id = "currency_name")
	private WebElement CurrencyNamedropdown;
	@FindBy(name = "conversion_rate")
	private WebElement RateTextFiled;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton;
	public Settings()
	{
		PageFactory.initElements(BaseClassvtiger.driver, this);
	}
	
	public void ClickonCurrencylink()
	{
		Currencies.click();
	}
	public void ClickOnNewCurrency()
	{
		NewCurrency.click();
	}
	public void SelectCountry(int index) 
	{
	Select s1=new Select(CurrencyNamedropdown);
		s1.selectByIndex(index);
	}
	public void EnterRate(String rate)
	{
		RateTextFiled.sendKeys(rate);
	}
	public void ClicOnSaveButton()
	{
		saveButton.click();
	}
	

}
