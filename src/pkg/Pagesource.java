package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {
 static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
driver.get(baseurl);
String src=driver.getPageSource();
String acutual="copyright";
String expected="copyright";
if
(acutual.equals(expected))
{
	   System.out.println("text present ");
    }
    else
 	   {
 		   System.out.println("not present");

	}

}}
