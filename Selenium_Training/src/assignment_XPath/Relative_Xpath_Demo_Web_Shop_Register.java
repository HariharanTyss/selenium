package assignment_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath_Demo_Web_Shop_Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Chandelwar");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chandelwar14@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Nikhil@123");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Nikhil@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='result']")).getText());
		driver.quit();
	}
}
