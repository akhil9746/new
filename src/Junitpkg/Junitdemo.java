package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
			 {
				 driver=new ChromeDriver();
				 driver.get("https://www.google.com");
				
			 }

	@org.junit.Test
	public void tittleverification()
	{
		String act=driver.getTitle();
		String exp="Google";
		if(act.equals(exp))
		{ 
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void tearDown()
	{
	driver.quit();
	
}}
 