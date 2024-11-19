package testngpkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowsertest {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		
	}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	
		else
		{
			driver=new FirefoxDriver();
		}
	}
	
	@org.testng.annotations.Test
	public void test()
	{
	driver.get("https://www.facebook.com/");	
	}
	
	}
	
	
	
	
	
	
	
	


