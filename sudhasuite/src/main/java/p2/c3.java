package p2;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {
	
	
	@Test(groups="two")
	public void t3() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com");
		
		ob.findElementByLinkText("Images").click();
		
		ob.navigate().back();
		Thread.sleep(3000);
		ob.navigate().forward();
		Thread.sleep(3000);
		File f = ob.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("first.png"));
		
	}


}
