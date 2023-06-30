package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Shop_Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
		driver.findElement(By.id("LastName")).sendKeys("Chandelwar");
		driver.findElement(By.id("Email")).sendKeys("chandelwar8@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hello@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.name("register-button")).click();
	}
}