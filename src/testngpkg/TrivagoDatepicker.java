package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoDatepicker {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com.tr/");
	}
	@Test
	public void datepicker()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[2]/div/div[4]/div/div/fieldset/button[1]/span/span[1]")).click();
		trivagodatepicker("December 2024","24");
	}
	private void trivagodatepicker(String expmonth, String expdate) {
		while(true)
		{
			String month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			System.out.println("months="+month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/button[1]/span")).click();
				
			}
List<WebElement> date= driver.findElements(By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[30]/time"));
			
			for(WebElement d:date)
			{
				String datetext=d.getText();
				if(datetext.equals(expdate))
				{
					d.click();
					break;
				}
				
				
				
				
				
			}
			
		}
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	

}
