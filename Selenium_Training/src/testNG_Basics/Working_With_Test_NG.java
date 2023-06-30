package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Working_With_Test_NG {

	//Instead of using main(), we can use @Test annotation with a method , From here execution get started
	@Test
	public void Demo() {	//This is act like one Test Case
		
		//Inside this, every line is act as a one step of test case
		System.out.println("Welcome to Test NG");
	}
	
	//We can use multiple @Test annotations into a single TestNG class
	@Test
	public void demo() {
		System.out.println("Welcome to Demo2()");
		Reporter.log("Hello TestNG");
	}
	
	@Test
	public void Demo3() {
		System.out.println("Thank you for coming...");
	}
}
