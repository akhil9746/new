package testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtendReport {
	
	
	WebDriver driver;
	
	String baseurl="https://www.facebook.com";
	ExtentSparkReporter reporter;
ExtentTest test;
ExtentReports extent;


@BeforeTest
public void beforetest()

{
	reporter=new ExtentSparkReporter("./Reports/myreport1.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname","localhost");
	extent.setSystemInfo("os","Windows10");
	extent.setSystemInfo("testername","akhil");
	extent.setSystemInfo("Browser Name","chrome");
	driver=new ChromeDriver();
}
@BeforeMethod
public void setup()
{
	driver.get(baseurl);
	
}
@Test
public void fbtittleverification()
{
	test=extent.createTest("fbtittleverification");
	String exp="facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(exp, actual);
}
@AfterTest
public void teardown()
{
	
	extent.flush();
}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
{
	test.log(Status.FAIL,"test case skipped is"+result.getName());
	
	test.log(Status.FAIL,"test case failed is"+result.getThrowable());
	String screenshotpath=screenshotMethord(driver,result.getName());
	
	test.addScreenCaptureFromPath(screenshotpath);
	
}
		else
		{
			if(result.getStatus()==ITestResult.SKIP)
			{
				test.log(Status.SKIP,"test case skipped is"+result.getName());
				
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS,"test case passed is"+result.getName());
			}
	
		}
	
	
	
}
	public String screenshotMethord(WebDriver driver, String screenshotname) throws IOException 
	{
		
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		String destination="./Screenshot/"+screenshotname+".jpeg";
	//	File finaldestination=new File(destination);
	//	FileHandler.copy(src, finaldestination);
		
		FileHandler.copy(src, new File(destination));
		
		return  destination;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
