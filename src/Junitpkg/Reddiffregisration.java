package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiffregisration {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void reddifflink()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		if(li.size()==30)
		{
			System.out.println("test passed:total no of links is =30");
			
		}
		else
		{
			System.out.println("test failed:total no of links="+li.size());
		}
	}
	
	
	
	
	
	
	
	
}
