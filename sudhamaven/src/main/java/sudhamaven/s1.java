package sudhamaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver(); 
		ob.get("https://www.google.com");
	}

}
