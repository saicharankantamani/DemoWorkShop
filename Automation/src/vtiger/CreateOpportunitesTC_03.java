package vtiger;

import org.testng.annotations.Test;

public class CreateOpportunitesTC_03 extends BaseClassvtiger
{
	@Test
	public void CreateOpportunitesTC_03() throws InterruptedException
	{
		Homepage1 h1=new Homepage1();
		h1.clickOnOpportunities();
		Opportunities op=new Opportunities();
		op.clickOnOpportunitiesButton();
		op.enterOpportunityName("saicharan");
		op.clickkonrelatedtoDropdown("Organizations");
		op.clickOnAddButton();
		Thread.sleep(3000);
		op.clickOnsalesStagedropdown("Needs Analysis");
		op.clickonAssignedToradiobutton();
		op.clickonAssignedToDropdown(1);
		op.clickOnSaveButton();

}
}
