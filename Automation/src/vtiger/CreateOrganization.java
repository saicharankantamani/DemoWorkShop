package vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import userdefinedclasses.ExcelOperation;

public class CreateOrganization extends BaseClassvtiger {
	@Test
	
	public void testCreateOrganization() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	String OrganizationsName=ExcelOperation.readData("Sheet4", 1, 8);
	Homepage1 ho1=new Homepage1();
	ho1.clickOnOrganizationLink();
	Organizations og=new Organizations();
	og.clickoncreateOrganizationsButton();
	og.entercreateOrganizationName(OrganizationsName);
	og.clickOnSavebutton();
}
}
