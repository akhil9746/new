package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbloginTest {
	
	   WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	    }

	    @Test
	    public void testlogin()
	    {
	    FbloginPage ob=new FbloginPage(driver);
	        ob.setvalues("akhil@gmail.com", "akhil");
	        ob.login();
	    }
	}
	
	
	
	
	
	
	
	
	
	


