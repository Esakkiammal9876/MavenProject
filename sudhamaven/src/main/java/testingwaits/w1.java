package testingwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {
	
	/*
	 *webdriver synchronisation techniques: testng waits
	 *
	 * conditional waits       : explicit wait 
	 * unconditional waits     : implicit wait
	 * 
	 * implicit wait :  once it is declared all the code which is present after it will take the time limit
	 * 
	 * code is correct: code is correct, if it executes within time limit, then it will proceed further
	 * code is wrong : it will wait for the completion of time limit, then it will throw up error
	 ** 
	 * */
	@Test
	public void im() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh(); 
		Thread.sleep(3000);
		driver.findElementByLinkText("Images").click();
		driver.quit();

	}

}
