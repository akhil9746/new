package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddiffTittle {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void reddifftittle()
	{
		WebElement rediflogo =driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	boolean	 l=rediflogo.isDisplayed();
	
		if(l)
		{
		System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is absent");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
