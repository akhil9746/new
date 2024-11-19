package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReddiffDropdown {

	

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
	}
	@Test
	public void dropdown()
	{
		
		
	WebElement day=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		
		Select  ob=new Select(day);
		ob.selectByValue("02");
		
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select ob1=new Select(month);
		ob1.selectByValue("01");
		
	WebElement year=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select ob2=new Select(year);
		ob2.selectByValue("2024");
		
WebElement button=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		String buttonText=button.getText();
		if(buttonText.equals(buttonText))
		{
			System.out.println("text verification passed");
		}
		else
		{
			System.out.println("verification  failed");
		}
	}}
	
	
	
	
	
	
	
	
	
	
	

