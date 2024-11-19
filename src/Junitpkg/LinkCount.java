package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void fblogin()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());
		for
		(WebElement ele:li)
		{
		String link=ele.getAttribute("href");
		verify(link);
		
	}
	}
	
	


	private void verify(String link) {
	
	try
	{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("sucess response code is 200-------"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link response code is 404------"+link);
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}}
	
		
	
		
	
