package p1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {
	
	@Test(groups="one")
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//switch ur control to that frame
		//frame,id,name or index
		ob.switchTo().frame(0);
		
		Actions ac = new Actions(ob);
		WebElement e1 = ob.findElementById("draggable");
		WebElement e2 = ob.findElementById("droppable");
		ac.dragAndDrop(e1, e2).build().perform();
	}

}
