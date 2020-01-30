package extentreport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import listeners.BaseClassActi;


public class GenerateReports  extends TestListenerAdapter
{
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	@Override
	public void onStart(ITestContext arg0)
	{
		String date=new SimpleDateFormat("YYYYMMddhhmmss").format(new Date());
		String rep="Test-Report"+date+".html";
		reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+rep);
		
	}
	@Override
	public void onTestStart(ITestResult rv)
	{
	BaseClassActi.log.info("test started");
	}
	@Override
	public void onTestSuccess(ITestResult rv)
	{
BaseClassActi.log.info("test sucess");
	}
	@Override
	public void onTestFailure(ITestResult rv)
	{
		String s=rv.getName();
		String date=new SimpleDateFormat("YYYYMMddhhmmss").format(new Date());
		EventFiringWebDriver fb=new EventFiringWebDriver(BaseClassActi.driver);
	    File f1=fb.getScreenshotAs(OutputType.FILE);
	    File f2=new File(System.getProperty("user.dir")+"/screenshot/"+s+date+".jpg");
	    try {
			FileUtils.moveFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    		BaseClassActi.log.fatal("failure");
	}
	@Override
	public void onTestSkipped(ITestResult rv)
	{
		System.out.println("test is skipped");
	}

}
