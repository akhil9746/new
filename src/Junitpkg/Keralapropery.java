package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralapropery {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
		@Test
		public void login()
		{
			driver.findElement(By.id("ulogin")).sendKeys("abcd@123");
			driver.findElement(By.id("upass")).sendKeys("123456");
			driver.findElement(By.id("sub_logbtn")).click();
		}
	}


