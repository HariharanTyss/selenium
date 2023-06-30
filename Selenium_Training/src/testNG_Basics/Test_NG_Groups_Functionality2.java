package testNG_Basics;

import org.testng.annotations.Test;

public class Test_NG_Groups_Functionality2 {

	@Test
	public void SubscribeTest() {
		System.out.println("Executing Subscribe");
	}
	@Test(groups = "SmokeTest")
	public void VoteTest() {
		System.out.println("Executing Vote");
	}
}