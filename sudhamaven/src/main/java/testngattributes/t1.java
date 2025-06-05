package testngattributes;

import org.testng.annotations.Test;

public class t1 {
	
	/*testng : test next generation
	 * 
	 * testing framework
	 * inspired from j unit
	 * annotations
	 * assertions
	 * waits
	 * suite
	 * parallel execution
	 * automatic report generation
	 * 
	 *test case
	 *    nonstatic 
	 *    @Test
	 *    default order: alphabetical 
	 * 
	 * */
	
	//priority
	//description
	//groups
	//invocation count
	//enable=false:disabling/ignoring
	//time out
	
	@Test(priority=0,description="first",groups="L",invocationCount=5,enabled=true)
	public void ab() {
		System.out.println("test case 1");
	}
	
 	@Test(priority=1,description="second",groups="L",timeOut=3000,enabled=true)
	public void z() throws InterruptedException { 
		Thread.sleep(3000 );
		
		System.out.println("test case 2");
	}
	
	@Test(priority=2,description="third",groups="L")
	public void cd() {
		System.out.println("test case 3");
	}

}
