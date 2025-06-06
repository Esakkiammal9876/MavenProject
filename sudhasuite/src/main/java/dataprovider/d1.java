package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d1 {
	
ChromeDriver driver;
    
    // Data provider - helps with data driven test cases that carry same method but
    // run multiple times with different data sets 

    @DataProvider(name = "dhivya")
    public static Object[][] DataSet(){
        // arrayname[row][col]
        Object[][] obj = {
                {"Dhivyakarthi123", "12345"},  //row   00   01  02
                {"DDD", "555"},                //row   10   11  12
                {"DEEPA","3456"}
                };
        return obj;
    }

    @Test(dataProvider = "dhivya")// we made the connection     
    //first    type=valid   username=Dhivyakarthi123   password=12345
    //second   type=invalid username=DDD               password=555
    //third    type=in      username=DEEPA             password=3456
     public void DataProvSampleTest(String username, String password) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "D:\\download\\chromedriver-win64");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://www.mycontactform.com/");
        
     //login (used for both valid and invalid case)
        driver.findElementById("user").sendKeys(username);
        driver.findElementById("pass").sendKeys(password);
        driver.findElementByName("btnSubmit").click();

        Thread.sleep(2000);
        driver.quit();
    }
}
