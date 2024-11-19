package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demositeprgm {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileuplod()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("H:\\New folder\\screenshot2.png");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		
		
		String s=driver.getTitle();
		String exp="Submit";
		if(s.equals(exp))
		{ 
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
