package test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;

public class DWS_Search_Test_Case extends Base_Test{

	@DataProvider(name = "Search_Data")
	public Object[][] searchData() {
		
		Object[][] data = new Object[3][1];
		
		data[0][0] = "mobiles";
		data[1][0] = "laptop";
		data[2][0] = "cloth";
		
		return data;
	}
	
	@Test(dataProvider = "Search_Data")
	public void search(String value) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys(value);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.quit();
	}
}
