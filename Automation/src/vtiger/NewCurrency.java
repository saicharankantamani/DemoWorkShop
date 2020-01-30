package vtiger;

import org.testng.annotations.Test;

public class NewCurrency extends BaseClassvtiger {
	@Test
	public void NewCurrency()
	{
		Homepage1 ho=new Homepage1();
		ho.CliconSettings();
		Settings ss=new Settings();
		ss.ClickonCurrencylink();
		ss.ClickOnNewCurrency();
		ss.SelectCountry(10);
		ss.EnterRate("70");
		ss.ClicOnSaveButton();
		}

}
