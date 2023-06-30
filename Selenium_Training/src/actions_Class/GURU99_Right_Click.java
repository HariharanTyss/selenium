package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GURU99_Right_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//Identify the webelement
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Object creation of Actions class
		Actions action = new Actions(driver);
		
		//Right click on button
		action.contextClick(button).perform();
		Thread.sleep(1000);
		
		//Identify the webelement
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		//mouse hover action and then click
		action.moveToElement(copy).click().perform();
	}
}
