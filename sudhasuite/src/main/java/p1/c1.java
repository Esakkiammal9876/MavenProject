package p1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="one")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		
		//create an object for select class
		// pass dropdown box as input
		// index/value/visible text
		
		// only one option can be selected
		WebElement ele = ob.findElementById("carselect");
		Select s= new Select(ele);
		//s.selectByIndex(2);
		//s.selectByVisibleText("Benz");
		s.selectByValue("honda");
	}
}



