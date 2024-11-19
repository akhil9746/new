package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	// chromedriver
	// edgedriver
	//firefoxdriver
		
		ChromeDriver driver=new ChromeDriver();// to open chrome browser
		driver.get("https://www.google.com");// to launch web application
        
       String actualtitle=  driver.getTitle();
       String expectedtittle="google";
       
       if
       (actualtitle.equals(expectedtittle))
       {
    	   System.out.println("pass");
       }
       else
    	   {
    		   System.out.println("fail");
       }
	}}


