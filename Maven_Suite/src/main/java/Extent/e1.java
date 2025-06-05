package Extent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class e1 {
	//create an obj for extent report class
	//pass name of the file
	// start test
	//logs
	//end test
	//flush the report
	
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public void startTest() {
		//creating an object for extent reports class,pass path as input,globally
		report = new ExtentReports("sudha html");
		//test start,finish,logging
		test = report.startTest("e1");
		
		test.log(LogStatus.ERROR,"It may fail");
		test.log(LogStatus.INFO,"In before class");
}
	@Test
	public void extentReports() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.co.in");
		Assert.assertEquals(ob.getTitle(), "Google");
		test.log(LogStatus.PASS, "Test case passed");
		test.setDescription("this is about google");
		ob.quit();
	}
	
	@AfterClass
	public void endtest() {
		test.log(LogStatus.INFO,"In after class");
		report.endTest(test);
		report.flush();
	}
}
