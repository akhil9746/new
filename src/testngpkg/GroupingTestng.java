package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingTestng {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void link()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test(groups ="sanity")
	public void radiobutton()
	{
		WebElement Radiobutton = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));

		boolean R= Radiobutton.isSelected();

		
	}
	
	
	@Test(groups = {"smoke","sanity"})
	public void reddifflink()
	{

		List<WebElement> li=driver.findElements(By.tagName("a"));
		
		
	}
	
	@Test(groups ="regression")
	public void reddifftittle()
	{

		WebElement rediflogo =driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	boolean	 l=rediflogo.isDisplayed();
	
		
	}
	

}
