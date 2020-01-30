package PageFrameWork;

import org.testng.annotations.Test;

import userdefinedclasses.BaseClass;

public class CreateCustomerTC_01 extends BaseClass{
	@Test
	public void testCreateCustomerTC_01()
	{
		OpenTasks otp=new OpenTasks();
		otp.ClickonProjectsandCustomerslink();
		ActiveProjectsandCustomers apc=new ActiveProjectsandCustomers();
		apc.clickOnAddNewCustomerButton();
		AddNewCustomer anc=new AddNewCustomer();
		anc.entercustomernae("sdssatysa4");
		anc.clickcreateCustomerSubmit();
		String s=apc.retrivesucessmessage();
		System.out.println(s);}

}
