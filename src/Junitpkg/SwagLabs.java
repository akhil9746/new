package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        driver.findElement(By.name("login-button")).click();
		
	)
		
	
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


