package test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;

public class DWS_Community_Poll_Test_Case extends Base_Test{

	@Test
	public void communityPoll() throws InterruptedException {
		
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vote-poll-1")).click();
		driver.quit();
	}
}
