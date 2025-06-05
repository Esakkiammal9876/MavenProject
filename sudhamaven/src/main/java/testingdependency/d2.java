package testingdependency;

import org.testng.annotations.Test;

public class d2 {
	
	
	@Test(priority=0,groups="LK")
	public void visiting()
	{
		System.out.println("visiting website");
	}
	
	@Test(priority=1,groups="LK")
	public void lg()
	{
		System.out.println("login");
	}

	@Test(priority=2,dependsOnGroups="LK")
	public void home()
	{
		System.out.println("home");
	}
	
	

}
