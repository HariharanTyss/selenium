package test_Cases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_Utility.Base_Test;

public class DWS_Register_Test_Case extends Base_Test{

	@DataProvider(name = "Register_Data")
	public Object[][] registerData() {
		
		Random r = new Random();
		int num = r.nextInt(100);
		String email = "ramsetu"+num+"@gmail.com";
		
		
		Object[][] data = new Object[1][5];
		
		data[0][0] = "Ram";
		data[0][1] = "Setu";
		data[0][2] = email;
		data[0][3] = "RamSetu";
		data[0][4] = "RamSetu";
		
		return data;
	}
	
	@Test(dataProvider = "Register_Data")
	public void Register(String fname, String lname, String email, String pwd, String cpwd) throws InterruptedException {
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		driver.findElement(By.id("LastName")).sendKeys(lname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='page registration-result-page']")).getText());
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
}
