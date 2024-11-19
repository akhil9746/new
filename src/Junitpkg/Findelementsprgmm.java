package Junitpkg;


	
	import java.util.List;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Findelementsprgmm
	{
		
		public class Facebook {
			ChromeDriver driver;
			@Before
			public void setup()
			{
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
			}
			@Test
			public void FindElements()
			{
				List<WebElement> li=driver.findElements(By.tagName("a"));
				System.out.println("total no of links="+li.size());
			}
		
		
		}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


