package testNG_Basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_Prperty_File {

	@Test
	public void logiToDWS() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("./TestData/Configuration.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("chandelwar7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hello@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
