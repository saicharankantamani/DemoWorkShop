  package vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import userdefinedclasses.ExcelOperation;

public class Createnewlead extends BaseClassvtiger
{
@Test
	
	public void Createnewlead() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String lastname=ExcelOperation.readData("Sheet4	", 1, 4);
		System.out.println("lastname");
		String companyname=ExcelOperation.readData("Sheet4	", 1, 5);
		
		//long mobilenum=ExcelOperation.numreadData("Sheet4	", 1, 6);
		String rating=ExcelOperation.readData("Sheet4", 1, 7);
		String assignedto=ExcelOperation.readData("Sheet4", 1, 8);
	Homepage ho=new Homepage();
	ho.selectleadbutton();
	Leadspage lp=new Leadspage();
	lp.clickcreateleadbutton();
	System.out.println("click1");
	
	lp.enterlastname(lastname);
	lp.entercompanyname(companyname);
	//lp.entermobilenumber(mobilenum);
	lp.selectarating(rating);
	lp.selectradiobutton();
	lp.selectassignedto(assignedto);
	lp.clickonsavebutton();
	System.out.println("execution done");
	
	}}


