package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbcreatepagePagefactory {
	
	
	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbcreatepage;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	
	
	
	public FbcreatepagePagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void process()
	{
		fbcreatepage.click();
		
		String src=driver.getPageSource();
		if(src.contains("about"))
		{
			System.out.println("it contains");
		}
		else
		{
			System.out.println("it does not contains");
		}
		
		signup.click();
}}
