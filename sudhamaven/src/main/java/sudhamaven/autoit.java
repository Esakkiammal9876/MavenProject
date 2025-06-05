package sudhamaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoit {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//Thread.sleep(3000);
		ob.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html"); 
		Thread.sleep(3000); 
		ob.executeScript("window.scrollBy(0,1200)"); 
		Thread.sleep(3000); 
		WebElement ele = ob.findElement(By.xpath("//input[@type='file']")); 
		Actions ac= new Actions(ob); 
		ac.moveToElement(ele).click().build().perform(); 
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\s1.exe");
	}


}
