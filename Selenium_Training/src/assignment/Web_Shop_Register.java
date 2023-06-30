package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Shop_Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.linkText("Register"));
		if (register.isEnabled()) {
			register.click();
		} else {
			System.out.println("Register link is not displayed");
		}
		Thread.sleep(500);
		WebElement radioButton = driver.findElement(By.id("gender-male"));
		radioButton.click();
		if(radioButton.isSelected()) {
			System.out.println("Value of Radio Button = "+radioButton.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Nikhil");
		if(firstName.isEnabled()) {
			System.out.println("Value of First Name = "+firstName.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Chandelwar");
		if(lastName.isEnabled()) {
			System.out.println("Value of Last Name = "+lastName.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("chandelwar11@gmail.com");
		if(email.isEnabled()) {
			System.out.println("Value of Email = "+email.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Nikhil@123");
		if(password.isEnabled()) {
			System.out.println("Value of Password = "+password.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("Nikhil@123");
		if(confirmPassword.isEnabled()) {
			System.out.println("Value of Confirm Password = "+confirmPassword.getAttribute("value"));
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(500);
		WebElement registerButton = driver.findElement(By.id("register-button"));
		if(registerButton.isEnabled()) {
			registerButton.click();
			
		}
		else {
			System.out.println("fail");
		}
		System.out.println(driver.findElement(By.className("result")).getText());
		Thread.sleep(1000);
		driver.quit();
	}
}
