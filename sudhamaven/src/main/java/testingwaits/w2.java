package testingwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class w2 {
	
	/*explicit wait: conditional synchronisation
	 * 
	 * time limit is applicable for particular conditions
	 * create an object for webriver wait
	 * pass driver object and time limit
	 * call untill method
	 * call conditions 
	 * 
	 *  code is correct: code is correct, if it executes within time limit, then it will proceed further
	 * code is wrong : it will wait for the completion of time limit, then it will throw up error
	 * 
	 * 
	 * */
		@Test
		public void im()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
			
		    WebDriverWait w= new WebDriverWait(driver,4);//-this is old syntax 
		    // title
		    w.until(ExpectedConditions.titleIs("Google"));
		    w.until(ExpectedConditions.titleContains("oo"));
		    
		    //alert
		    w.until(ExpectedConditions.alertIsPresent());
		    
		    // visibility of an element
		   w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));//4
		    
		    //visibility of more elements 
		   w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img"))); //4
		    
		    // element is clickable or not
		    w.until(ExpectedConditions.elementToBeClickable(By.linkText("About"))).click();
		    
		    //4
		    //driver.quit();
		}
}

