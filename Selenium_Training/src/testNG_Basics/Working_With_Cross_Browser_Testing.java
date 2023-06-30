package testNG_Basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import framework_Utility.Base_Test_Cross_Browser;

public class Working_With_Cross_Browser_Testing extends Base_Test_Cross_Browser {

	@Test
	public void loginTest() {
		
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nikhil123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
