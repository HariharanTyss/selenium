package test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;

public class DWS_Newsletter_Test_Case extends Base_Test{

	@DataProvider(name = "Subscribe_Data")
	public Object[][] subscribe() {
		
		Object[][] data = new Object[1][1];
		
		data[0][0] = "chandelwar7@gmail.com";
		
		return data;
	}
	
	//@Parameters("username")
	@Test(dataProvider = "Subscribe_Data")
	public void newsLetter(String usn) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("newsletter-email")).sendKeys(usn);
		Thread.sleep(2000);
		driver.findElement(By.id("newsletter-subscribe-button")).click();
//		driver.quit();
	}
}
