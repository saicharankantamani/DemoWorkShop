package actiTime;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class Listeners  extends TestListenerAdapter{
	@Override
	public void onTestStart(ITestResult rv)
	{
		System.out.println("Test is Started");
	}
	@Override
	public void onTestSuccess(ITestResult rv)
	{
		System.out.println("Test is succes");
	}
	@Override
	public void onTestFailure(ITestResult rv)
	{
		System.out.println("Test is failure");
	}
	@Override
	public void onTestSkipped(ITestResult rv)
	{
		System.out.println("test is skipped");
	}

}
