package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automtednewtesting {
	static String baseurl="https://facebook.com";
	public static void main(String[] args) {
		
		
			ChromeDriver driver=new ChromeDriver();
	driver.get(baseurl);

	String acutualtittle="Facebook";
	String expectedtittle="Facebook";
	if
	(acutualtittle.equals(expectedtittle))
	{
		   System.out.println("pass ");
	    }
	    else
	 	   {
	 		   System.out.println("fail");

		}
	String src=driver.getPageSource();
	String acutual="facebook";
	String expected="facebook";
	if
	(acutual.equals(expected))
	{
		   System.out.println("text present ");
	    }
	    else
	 	   {
	 		   System.out.println("not present");
	
	 	   }}}

