package test_Cases;

import org.testng.annotations.Test;

public class jdjir {

	@Test(priority = -1)
	public void a() {
		System.out.println("a");
	}
	@Test(priority = 0)
	public void c() {
		System.out.println("b");
	}
	@Test 
	public void b() {
		System.out.println("c");
	}
	
}
