package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchprgm {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void googlesearch()
	{
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("java",Keys.ENTER);
		driver.findElement(By.name("btnk")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
