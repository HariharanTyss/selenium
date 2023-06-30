package test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;

public class DWS_Login_Test_Case extends Base_Test{

	@DataProvider(name = "Login_Data")
	public Object[][] loginData() {
		
		Object[][] data = new Object[1][2];
		
		data[0][0] = "nikhil26@gmail.com";
		data[0][1] = "nikhil123";
		
		return data;
	}
	
	//@Parameters({"username","password"})
	@Test(dataProvider = "Login_Data")
	public void Login(String usn, String pwd) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(usn);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@class='email']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText());
		Thread.sleep(2000);
//		driver.quit();
	}
}
