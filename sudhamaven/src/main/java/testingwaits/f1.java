package testingwaits;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class f1 {
	//Fluent Wait in Selenium marks the maximum amount of time for Selenium WebDriver
	
	//to wait for a certain condition (web element) becomes visible. 
		//It also defines how frequently WebDriver will check if the condition appears
		//before throwing the “ElementNotVisibleException”.
	@Test
	public void ab() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//Declare and initialise a fluent wait
				FluentWait w = new FluentWait(driver);
				//Specify the timout of the wait
				w.withTimeout(Duration.ofSeconds(4));
				
				w.withMessage("admin");
				
				//Sepcify polling time
				//w.pollingEvery(2000, TimeUnit.MILLISECONDS);
				
				
				w.until(ExpectedConditions.alertIsPresent());
				
				
				driver.quit();
	}

	}

	//implicit wait:   yahoo -> title
	// explicit wait:  https://demo.automationtesting.in/Register.html . fullname: visibility



