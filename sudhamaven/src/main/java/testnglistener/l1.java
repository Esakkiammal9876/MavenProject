package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class l1 implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Sucessed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failured");
	}

	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Started");
	}
	
	public void onStopped(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished");
	}
	
	

}
