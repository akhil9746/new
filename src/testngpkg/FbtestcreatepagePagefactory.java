package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbtestcreatepagePagefactory {
	
	  WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	    }
	    @Test
		public void testcreatepage()
		{
	    	 FbcreatepagePagefactory ob=new  FbcreatepagePagefactory(driver);
			ob.process();
		}
		

}
