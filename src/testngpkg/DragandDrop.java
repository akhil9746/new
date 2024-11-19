package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		WebElement e=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement f=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		WebElement a=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement c=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement d=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
		
		
		WebElement h=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement i=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions act=new Actions(driver);
		Actions act1=new Actions(driver);
		act1.dragAndDrop(e, f).perform();
		act1.dragAndDrop(a, b).perform();
		Actions act2=new Actions(driver);
		act2.dragAndDrop(c, d).perform();
		Actions act3=new Actions(driver);
		act3.dragAndDrop(h,i).perform();
		WebElement text =driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		boolean	 l=text.isDisplayed();
		
			if(l)
			{
			System.out.println("text is present");
			}
			else
			{
				System.out.println("text is absent");
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
