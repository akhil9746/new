package testngpkg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlingamazone {
	

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=4622201017925653813&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007776&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input")).sendKeys(" phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

ArrayList<String>windowdetails=new ArrayList<>(driver.getWindowHandles());

driver.switchTo().window(windowdetails.get(1));
driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
	}
	
	

}
