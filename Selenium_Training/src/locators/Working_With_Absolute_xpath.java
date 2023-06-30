package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Absolute_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chand/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Nikhil");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Chandelwar");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Test Yantra");
		driver.findElement(By.xpath("html/body/div[2]/input[2]")).sendKeys("Bangalore");
		Thread.sleep(500);
		driver.quit();
	}
}
