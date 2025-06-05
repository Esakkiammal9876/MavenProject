package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class l1 {
	
	static Logger log= LogManager.getLogger(l1.class); 
	@Test
	public void t2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com");
		log.info("visited google.com");
		log.debug("going to clicked on the Images");
		log.warn("It may failed");
		ob.findElement(By.linkText("Images"));
		Thread.sleep(2000);
		log.info("going to quit");
		ob.quit();
		

}
}