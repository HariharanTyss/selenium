package testNG_Basics;

import org.testng.annotations.Test;

public class Test_NG_Including_By_XML_File_Functionality {

	@Test
	public void SearchTest() {
		System.out.println("Executing Search");
	}
	
	@Test
	public void LoginTest(){
		System.out.println("Executing Login");
	}
	
	@Test
	public void RegisterTest() {
		System.out.println("Executing Register");
	}
	
	@Test
	public void SubscribeTest() {
		System.out.println("Executing Subscribe");
	}
}
