package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_Data_Provider {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() {
		Object[][] data = new Object[3][5];
		
		data[0][0] = "Nikhil";
		data[0][1] = "Chandelwar";
		data[0][2] = "chandelwar7@gmail.com";
		data[0][3] = "abcdef";
		data[0][4] = "abcdef";
		
		data[1][0] = "Aman";
		data[1][1] = "Singh";
		data[1][2] = "aman77@gmail.com";
		data[1][3] = "abcdefgh";
		data[1][4] = "abcdefgh";
		
		data[2][0] = "Vijay";
		data[2][1] = "Ganesan";
		data[2][2] = "vijay35@gmail.com";
		data[2][3] = "abcde123";
		data[2][4] = "abcde123";
		
		return data; 
	}
	
	@Test(dataProvider = "TestData")
	public void Register(String fName, String lName, String email, String pwd, String cPwd) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fName);
		driver.findElement(By.id("LastName")).sendKeys(lName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cPwd);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
