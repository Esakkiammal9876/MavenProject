package testingdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Real {
	
	ChromeDriver ob;
	@Test(priority=0,description="visiting1",groups="L1")
	public void visiting11()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ob = new ChromeDriver();
		ob.get("https://www.google.com");
	}
	
	@Test(priority=1,description="maximizing",groups="L1")
	public void maxs()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing",invocationCount=3,groups="L1")
	public void refreshinge()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="L1")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,description="backward",dependsOnGroups="L1")
		public void backward() {
			ob.navigate().back();
		}
	
	
	@Test(priority=4,description="closing",timeOut=5000,dependsOnGroups="L1")
	public void closing() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
