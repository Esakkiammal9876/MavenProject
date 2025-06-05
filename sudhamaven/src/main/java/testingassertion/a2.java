package testingassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	
	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    SoftAssert s= new SoftAssert();
	    s.assertEquals(driver.getTitle(), "Google");
	    s.assertNotEquals(driver.getTitle(), "Googldfe");
	    WebElement ele = driver.findElementByLinkText("Images");
	    s.assertTrue(ele.isDisplayed());
	    s.assertFalse(ele.isSelected());
	    driver.quit();
		//s.assertAll();
		
	}

}
