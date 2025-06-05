package testngAnnotation;


import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistener.l1.class)
public class a2 {
	
	/*before test: visiting
	 * before class: mx
	 *      before method: refresh   tc1: title  afteremthod : deleting cookies
	 *      before method : refresh  tc2: click  aftermethod : deleting cookies
	 * after class: getting url
	 * after test : closing 
	 */
	
	ChromeDriver ob;
	@BeforeTest
	public void entering()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ob = new ChromeDriver();
		ob.get("https://www.google.com");
	}
	
	@BeforeClass
	public void max()
	{
		//ob.manage().window().maximize();
	}
	
	@BeforeMethod
	public void ref()
	{
		ob.navigate().refresh();
	}
	@Test
	public void title()
	{
		System.out.println(ob.getTitle());
	}
	
	@Test
	public void clickingg()
	{
		ob.findElementByLinkText("Gmail").click();
	}
	
	@AfterMethod
	public void deleting()
	{
		ob.manage().deleteAllCookies();
	}

	
	
	@AfterClass
	public void gettingurl()
	{
		System.out.println(ob.getCurrentUrl());
	}
	
	@AfterTest
	public void closing()
	{
		ob.quit();
	}

}
