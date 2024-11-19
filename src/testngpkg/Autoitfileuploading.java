package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitfileuploading {
	
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void main() throws IOException, InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("C:\\Selenium\\t2.exe");
		Thread.sleep(4000);
	}
	
	
	
	
	
	
	
	
	

}
