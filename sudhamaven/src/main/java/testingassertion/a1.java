package testingassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
	
	/*assertion: technique where we will be comparing actual result with obtained result
	 * 
	 * hard asserts
	 *    provided by Assert builtin class
	 *    static in natre
	 *    assertion fails, it will not proceed further
	 *    
	 * soft asserts
	 *    provided by softassert builtin class
	 *    nonstatic in nature
	 *    even if assertion fails, it will proceed further
	 *    know the actual : invoke assertAll() 
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * * 
	 * */
	
	@Test
	public void hard()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    Assert.assertEquals(driver.getTitle(), "Google");
	    Assert.assertNotEquals(driver.getTitle(), "googlhiue");
	    WebElement ele = driver.findElementByLinkText("Images");
	    Assert.assertTrue(ele.isDisplayed());
	    Assert.assertFalse(ele.isSelected());
	    driver.quit();

		
	}
	

}
