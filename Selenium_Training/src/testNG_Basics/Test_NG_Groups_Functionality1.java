package testNG_Basics;

import org.testng.annotations.Test;

public class Test_NG_Groups_Functionality1 {

	@Test()
	public void SearchTest() {
		System.out.println("Executing Search");
	}
	
	@Test(groups = "SmokeTest")
	public void LoginTest(){
		System.out.println("Executing Login");
	}
	
	@Test(groups = "SmokeTest")
	public void RegisterTest() {
		System.out.println("Executing Register");
	}
}
