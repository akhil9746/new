package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlprgm1 {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/webpage.html");
		driver.manage().window().maximize();
	}
	@Test
	public void htmlprgmm()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=	driver.switchTo().alert();
	
	String text=a.getText();
	System.out.println("alert text="+text);
	a.accept();
		driver.findElement(By.name("firstname")).sendKeys("akhil");
		driver.findElement(By.name("lastname")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
		
		
		
		
		
	}}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


