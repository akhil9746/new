package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrsfacebook {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod
	public void link()
	{
		driver.get("https://www.facebook.com/?gclid=EAIaIQobChMIirm7ps6hiQMVL8o8Ah1SgQyIEAAYASAAEgLebfD_BwE&_rdr");
	}
	@Parameters({"username","password"})
@Test
public void fblogin(String username,String password)
{
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
}
}
