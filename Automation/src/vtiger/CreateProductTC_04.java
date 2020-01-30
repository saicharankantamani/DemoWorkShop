package vtiger;

public class CreateProductTC_04 extends BaseClassvtiger{
	
	public void CreateProductTC_04()
	{
		Homepage1 ho=new Homepage1();
		ho.clickOnProducts();
		Productspage pr=new Productspage();
		pr.enterproductName("switchgears");
		pr.selectProductCategoryDropdown("Hardware");
		pr.selectManufacturerDropdown(2);
	}

}
