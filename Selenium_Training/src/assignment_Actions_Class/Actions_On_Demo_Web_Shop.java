package assignment_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_On_Demo_Web_Shop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(computer).perform();
		Thread.sleep(1000);
		
		WebElement accessories = driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[1]"));
		action.moveToElement(accessories).click().perform();
		
		Thread.sleep(1000);
		WebElement electronics = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		action.moveToElement(electronics).perform();
		
		WebElement cellPhones = driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"));
		action.moveToElement(cellPhones).click().perform();
		
	}
}
