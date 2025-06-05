package testingdependency;

import org.testng.annotations.Test;

public class d1 {
	
	//dependOnMethod : create connection between test cases
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visiting website");
	}
	
	@Test(priority=1,dependsOnMethods="visiting")
	public void lg()
	{
		System.out.println("login");
	}

}
