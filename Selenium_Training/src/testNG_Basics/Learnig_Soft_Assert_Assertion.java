package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learnig_Soft_Assert_Assertion {

	@Test
	public void softAssert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		//The execution continues even we got error in the script
		//Used for Minor defects where we don't want our script to stop.
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Demo Web", "Title verifiaction");
		
		//If test script fails then window will not get closed.
		
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(3000);
		driver.quit();
		ast.assertAll();	//it is a compulsory method, to get the error message after script failure
							//otherwise after failure also, the output is "passed".
							//It should be last line of any code.
		
	}
}
