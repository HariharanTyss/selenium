package webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String subscribe_Class_Value = driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("class");
		System.out.println(subscribe_Class_Value);
		System.out.println();
		
		//before search anything
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		System.out.println("----------------------");
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		//after search an item
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		driver.quit();
	}
}
