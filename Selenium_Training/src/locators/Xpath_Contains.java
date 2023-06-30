package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']/following-sibling::span/parent::div/input")).click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]/parent::li/following-sibling::li[4]/a")).click();
		driver.findElement(By.xpath("//input[@id='small-searchterms']/parent::form/span/following-sibling::input[1]")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id='small-searchterms']/parent::form/span/following-sibling::input[2]")).click();
		
	}
}