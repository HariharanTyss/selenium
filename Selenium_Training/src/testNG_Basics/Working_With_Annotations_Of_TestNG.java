package testNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_With_Annotations_Of_TestNG {

//This is the flow of execution of TestNG annotations 
//Each @Test annotation is execute between @BeforMethod and @AfterMethod annotation
//	<@BeforeSuite>
//		<@BeforeTest>
//			<@BeforeClass>
//				<@BeforeMethods>
//					<@Test>		Test Case
//				<@AfterMethods>
//			<@AfterClass>
//		<@AfterTest>
//	<@AfterSuite>

	@Test
	public void test() {
		System.out.println("Executing Test annotation");
	}
	
	@BeforeTest
	public void beforTest() {
		System.out.println("Executing before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Executing after test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Executing after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing after method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Executing after suite");
	}
	
	@Test
	public void test2() {
		System.out.println("Executing test annotation 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Executing test annotation 3");
	}
	
}
