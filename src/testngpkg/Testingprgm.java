package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingprgm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("dotixow603@bulatox.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		Thread.sleep(3000);
		
		String act=driver.getCurrentUrl();
		
		String exp="https://keralaproperty.in/member/myhome/";
		if(act.equals(exp))
		{ 
			System.out.println(" login pass");
		}
		else
		{
			System.out.println(" login fail");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
