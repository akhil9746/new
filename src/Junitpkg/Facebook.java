package Junitpkg;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@org.junit.Test
public void fblogin()
{
	driver.findElement(By.id("email")).sendKeys("akhilps@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("asdfghjk");
	driver.findElement(By.name("login")).click();
}
}
