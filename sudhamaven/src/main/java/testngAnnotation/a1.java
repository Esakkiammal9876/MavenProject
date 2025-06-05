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

//@Listeners(testnglistener.l1.class)
public class a1 {

	/*
	 *before test: run only once before all the test cases started its execution
	 *after test:  run only once after all the test cases finished its execution
	 *
	 *before classs: run only once after before test 
	 *after class:   run only once before after test
	 *
	 *before method: run before each test case
	 *aftermethod : run after each test case 
	 *
	 * before test: entering
	 * before class: mx
	 *      before method: refresh   tc1: title  afteremthod : deleting cookies
	 *      before method : refresh  tc2: click  aftermethod : deleting cookies
	 * after class: getting url
	 * after test : closing 
	 * 
	 * 
	 * */
		ChromeDriver ob;
		@BeforeTest
		public void entering()
		{

			System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
			ob = new ChromeDriver();
			ob.get("https://www.google.com");
		}
		
		@AfterTest
		public void closing()
		{
			ob.quit();
		}
		
		@BeforeClass
		public void max()
		{
			ob.manage().window().maximize();
		}
		
		@AfterClass
		public void gettingurl()
		{
			System.out.println(ob.getCurrentUrl());
		}
		
		@BeforeMethod
		public void ref()
		{
			ob.navigate().refresh();
		}
		
		@AfterMethod
		public void deleting()
		{
			ob.manage().deleteAllCookies();
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
		
		
	}


