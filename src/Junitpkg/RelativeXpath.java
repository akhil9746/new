package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("asdfgh");
		driver.findElement(By.name("login")).click();
	}

}
